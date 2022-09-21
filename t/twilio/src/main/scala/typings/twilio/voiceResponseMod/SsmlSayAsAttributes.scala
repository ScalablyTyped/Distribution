package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlSayAsAttributes extends StObject {
  
  var `interpret-as`: js.UndefOr[SsmlSayAsInterpretAs] = js.undefined
  
  var role: js.UndefOr[SsmlSayAsRole] = js.undefined
}
object SsmlSayAsAttributes {
  
  inline def apply(): SsmlSayAsAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlSayAsAttributes]
  }
  
  extension [Self <: SsmlSayAsAttributes](x: Self) {
    
    inline def `setInterpret-as`(value: SsmlSayAsInterpretAs): Self = StObject.set(x, "interpret-as", value.asInstanceOf[js.Any])
    
    inline def `setInterpret-asUndefined`: Self = StObject.set(x, "interpret-as", js.undefined)
    
    inline def setRole(value: SsmlSayAsRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
