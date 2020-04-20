package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change[T] extends js.Object {
  /**
    * The type of change that was made to the item.
    */
  var changeType: VersionControlChangeType
  /**
    * Current version.
    */
  var item: T
  /**
    * Content of the item after the change.
    */
  var newContent: ItemContent
  /**
    * Path of the item on the server.
    */
  var sourceServerItem: String
  /**
    * URL to retrieve the item.
    */
  var url: String
}

object Change {
  @scala.inline
  def apply[T](
    changeType: VersionControlChangeType,
    item: T,
    newContent: ItemContent,
    sourceServerItem: String,
    url: String
  ): Change[T] = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newContent = newContent.asInstanceOf[js.Any], sourceServerItem = sourceServerItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change[T]]
  }
}

