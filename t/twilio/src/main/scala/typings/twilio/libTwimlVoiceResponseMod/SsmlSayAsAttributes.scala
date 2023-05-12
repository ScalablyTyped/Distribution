package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlSayAsAttributes extends StObject {
  
  /** format - Specify the format of the date when interpret-as is set to date */
  var format: js.UndefOr[SsmlSayAsFormat] = js.undefined
  
  /** interpret-as - Specify the type of words are spoken */
  var `interpret-as`: js.UndefOr[SsmlSayAsInterpretAs] = js.undefined
}
object SsmlSayAsAttributes {
  
  inline def apply(): SsmlSayAsAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlSayAsAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlSayAsAttributes] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: SsmlSayAsFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def `setInterpret-as`(value: SsmlSayAsInterpretAs): Self = StObject.set(x, "interpret-as", value.asInstanceOf[js.Any])
    
    inline def `setInterpret-asUndefined`: Self = StObject.set(x, "interpret-as", js.undefined)
  }
}
