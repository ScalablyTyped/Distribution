package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChange extends Change[TfvcItem] {
  /**
    * List of merge sources in case of rename or branch creation.
    */
  var mergeSources: js.Array[TfvcMergeSource]
  /**
    * Version at which a (shelved) change was pended against
    */
  var pendingVersion: Double
}

object TfvcChange {
  @scala.inline
  def apply(
    changeType: VersionControlChangeType,
    item: TfvcItem,
    mergeSources: js.Array[TfvcMergeSource],
    newContent: ItemContent,
    pendingVersion: Double,
    sourceServerItem: String,
    url: String
  ): TfvcChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], mergeSources = mergeSources.asInstanceOf[js.Any], newContent = newContent.asInstanceOf[js.Any], pendingVersion = pendingVersion.asInstanceOf[js.Any], sourceServerItem = sourceServerItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcChange]
  }
}

