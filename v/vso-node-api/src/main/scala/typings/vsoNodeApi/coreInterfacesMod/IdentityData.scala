package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityData extends StObject {
  
  var identityIds: js.Array[String]
}
object IdentityData {
  
  inline def apply(identityIds: js.Array[String]): IdentityData = {
    val __obj = js.Dynamic.literal(identityIds = identityIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityData]
  }
  
  extension [Self <: IdentityData](x: Self) {
    
    inline def setIdentityIds(value: js.Array[String]): Self = StObject.set(x, "identityIds", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdsVarargs(value: String*): Self = StObject.set(x, "identityIds", js.Array(value*))
  }
}
