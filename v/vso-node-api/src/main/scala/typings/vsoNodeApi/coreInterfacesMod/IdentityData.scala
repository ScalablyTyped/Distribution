package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityData extends StObject {
  
  var identityIds: js.Array[String] = js.native
}
object IdentityData {
  
  @scala.inline
  def apply(identityIds: js.Array[String]): IdentityData = {
    val __obj = js.Dynamic.literal(identityIds = identityIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityData]
  }
  
  @scala.inline
  implicit class IdentityDataMutableBuilder[Self <: IdentityData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityIds(value: js.Array[String]): Self = StObject.set(x, "identityIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdsVarargs(value: String*): Self = StObject.set(x, "identityIds", js.Array(value :_*))
  }
}
