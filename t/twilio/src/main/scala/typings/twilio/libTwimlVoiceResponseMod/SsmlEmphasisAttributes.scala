package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlEmphasisAttributes extends StObject {
  
  var level: js.UndefOr[SsmlEmphasisLevel] = js.undefined
}
object SsmlEmphasisAttributes {
  
  inline def apply(): SsmlEmphasisAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlEmphasisAttributes]
  }
  
  extension [Self <: SsmlEmphasisAttributes](x: Self) {
    
    inline def setLevel(value: SsmlEmphasisLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
