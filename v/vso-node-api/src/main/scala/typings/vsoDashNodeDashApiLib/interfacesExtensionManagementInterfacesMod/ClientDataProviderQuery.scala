package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDataProviderQuery extends DataProviderQuery {
  /**
    * The Id of the service instance type that should be communicated with in order to resolve the data providers from the client given the query values.
    */
  var queryServiceInstanceType: java.lang.String
}

object ClientDataProviderQuery {
  @scala.inline
  def apply(
    context: DataProviderContext,
    contributionIds: js.Array[java.lang.String],
    queryServiceInstanceType: java.lang.String
  ): ClientDataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context, contributionIds = contributionIds, queryServiceInstanceType = queryServiceInstanceType)
  
    __obj.asInstanceOf[ClientDataProviderQuery]
  }
}

