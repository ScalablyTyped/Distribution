package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDataProviderQuery extends DataProviderQuery {
  /**
    * The Id of the service instance type that should be communicated with in order to resolve the data providers from the client given the query values.
    */
  var queryServiceInstanceType: String
}

object ClientDataProviderQuery {
  @scala.inline
  def apply(context: DataProviderContext, contributionIds: js.Array[String], queryServiceInstanceType: String): ClientDataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any], queryServiceInstanceType = queryServiceInstanceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientDataProviderQuery]
  }
}

