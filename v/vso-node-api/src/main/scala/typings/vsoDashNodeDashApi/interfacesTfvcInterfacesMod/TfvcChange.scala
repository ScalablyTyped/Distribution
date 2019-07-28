package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

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
    val __obj = js.Dynamic.literal(changeType = changeType, item = item, mergeSources = mergeSources, newContent = newContent, pendingVersion = pendingVersion, sourceServerItem = sourceServerItem, url = url)
  
    __obj.asInstanceOf[TfvcChange]
  }
}

