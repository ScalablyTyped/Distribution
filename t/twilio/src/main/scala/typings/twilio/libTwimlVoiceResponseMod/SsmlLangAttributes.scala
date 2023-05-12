package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlLangAttributes extends StObject {
  
  /** xml:lang - Specify the language */
  @JSName("xml:lang")
  var xmlColonlang: js.UndefOr[SsmlLangXmlLang] = js.undefined
}
object SsmlLangAttributes {
  
  inline def apply(): SsmlLangAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlLangAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlLangAttributes] (val x: Self) extends AnyVal {
    
    inline def setXmlColonlang(value: SsmlLangXmlLang): Self = StObject.set(x, "xml:lang", value.asInstanceOf[js.Any])
    
    inline def setXmlColonlangUndefined: Self = StObject.set(x, "xml:lang", js.undefined)
  }
}
