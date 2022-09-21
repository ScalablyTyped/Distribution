package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity0 extends StObject {
  
  @JSName("Identity:0")
  var IdentityColon0: NameTensorShape
  
  @JSName("Identity_1:0")
  var Identity_1Colon0: NameTensorShape
  
  @JSName("Identity_2:0")
  var Identity_2Colon0: NameTensorShape
}
object Identity0 {
  
  inline def apply(
    IdentityColon0: NameTensorShape,
    Identity_1Colon0: NameTensorShape,
    Identity_2Colon0: NameTensorShape
  ): Identity0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Identity:0")(IdentityColon0.asInstanceOf[js.Any])
    __obj.updateDynamic("Identity_1:0")(Identity_1Colon0.asInstanceOf[js.Any])
    __obj.updateDynamic("Identity_2:0")(Identity_2Colon0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity0]
  }
  
  extension [Self <: Identity0](x: Self) {
    
    inline def setIdentityColon0(value: NameTensorShape): Self = StObject.set(x, "Identity:0", value.asInstanceOf[js.Any])
    
    inline def setIdentity_1Colon0(value: NameTensorShape): Self = StObject.set(x, "Identity_1:0", value.asInstanceOf[js.Any])
    
    inline def setIdentity_2Colon0(value: NameTensorShape): Self = StObject.set(x, "Identity_2:0", value.asInstanceOf[js.Any])
  }
}
