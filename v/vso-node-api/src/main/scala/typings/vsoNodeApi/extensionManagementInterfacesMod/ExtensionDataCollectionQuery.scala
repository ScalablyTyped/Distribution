package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDataCollectionQuery extends js.Object {
  /**
    * A list of collections to query
    */
  var collections: js.Array[ExtensionDataCollection]
}

object ExtensionDataCollectionQuery {
  @scala.inline
  def apply(collections: js.Array[ExtensionDataCollection]): ExtensionDataCollectionQuery = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollectionQuery]
  }
}

