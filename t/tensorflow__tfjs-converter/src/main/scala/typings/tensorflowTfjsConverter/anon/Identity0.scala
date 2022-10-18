package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity0 extends StObject {
  
  @JSName("Identity:0")
  var IdentityColon0: ResourceId
}
object Identity0 {
  
  inline def apply(IdentityColon0: ResourceId): Identity0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Identity:0")(IdentityColon0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity0]
  }
  
  extension [Self <: Identity0](x: Self) {
    
    inline def setIdentityColon0(value: ResourceId): Self = StObject.set(x, "Identity:0", value.asInstanceOf[js.Any])
  }
}
