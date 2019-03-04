package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderQuery extends js.Object {
  /**
    * Contextual information to pass to the data providers
    */
  var context: DataProviderContext
  /**
    * The contribution ids of the data providers to resolve
    */
  var contributionIds: js.Array[java.lang.String]
}

object DataProviderQuery {
  @scala.inline
  def apply(context: DataProviderContext, contributionIds: js.Array[java.lang.String]): DataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context, contributionIds = contributionIds)
  
    __obj.asInstanceOf[DataProviderQuery]
  }
}

