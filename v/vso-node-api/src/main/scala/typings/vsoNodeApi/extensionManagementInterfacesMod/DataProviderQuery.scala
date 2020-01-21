package typings.vsoNodeApi.extensionManagementInterfacesMod

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
  var contributionIds: js.Array[String]
}

object DataProviderQuery {
  @scala.inline
  def apply(context: DataProviderContext, contributionIds: js.Array[String]): DataProviderQuery = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contributionIds = contributionIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataProviderQuery]
  }
}

