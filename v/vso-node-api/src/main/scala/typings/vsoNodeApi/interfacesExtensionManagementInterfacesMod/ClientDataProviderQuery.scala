package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientDataProviderQuery
  extends StObject
     with DataProviderQuery {
  
  /**
    * The Id of the service instance type that should be communicated with in order to resolve the data providers from the client given the query values.
    */
  var queryServiceInstanceType: String
}
object ClientDataProviderQuery {
  
  inline def apply(context: DataProviderContext, contributionIds: js.Array[String], queryServiceInstanceType: String): ClientDataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any], queryServiceInstanceType = queryServiceInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDataProviderQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientDataProviderQuery] (val x: Self) extends AnyVal {
    
    inline def setQueryServiceInstanceType(value: String): Self = StObject.set(x, "queryServiceInstanceType", value.asInstanceOf[js.Any])
  }
}
