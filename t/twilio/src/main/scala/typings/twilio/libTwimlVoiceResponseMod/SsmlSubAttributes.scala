package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlSubAttributes extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
}
object SsmlSubAttributes {
  
  inline def apply(): SsmlSubAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlSubAttributes]
  }
  
  extension [Self <: SsmlSubAttributes](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
  }
}
