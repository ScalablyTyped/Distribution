package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DtlEnvironmentDetails extends StObject {
  
  var csmContent: String = js.native
  
  var csmParameters: String = js.native
  
  var subscriptionName: String = js.native
}
object DtlEnvironmentDetails {
  
  @scala.inline
  def apply(csmContent: String, csmParameters: String, subscriptionName: String): DtlEnvironmentDetails = {
    val __obj = js.Dynamic.literal(csmContent = csmContent.asInstanceOf[js.Any], csmParameters = csmParameters.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtlEnvironmentDetails]
  }
  
  @scala.inline
  implicit class DtlEnvironmentDetailsMutableBuilder[Self <: DtlEnvironmentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsmContent(value: String): Self = StObject.set(x, "csmContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsmParameters(value: String): Self = StObject.set(x, "csmParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: String): Self = StObject.set(x, "subscriptionName", value.asInstanceOf[js.Any])
  }
}
