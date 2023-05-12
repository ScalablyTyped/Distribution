package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlEmphasisAttributes extends StObject {
  
  /** level - Specify the degree of emphasis */
  var level: js.UndefOr[SsmlEmphasisLevel] = js.undefined
}
object SsmlEmphasisAttributes {
  
  inline def apply(): SsmlEmphasisAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlEmphasisAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlEmphasisAttributes] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: SsmlEmphasisLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
