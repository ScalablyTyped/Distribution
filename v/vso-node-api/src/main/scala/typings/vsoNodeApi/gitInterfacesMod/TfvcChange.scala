package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcChange extends Change[TfvcItem] {
  /**
    * List of merge sources in case of rename or branch creation.
    */
  var mergeSources: js.Array[TfvcMergeSource] = js.native
  /**
    * Version at which a (shelved) change was pended against
    */
  var pendingVersion: Double = js.native
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
  @scala.inline
  implicit class TfvcChangeOps[Self <: TfvcChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMergeSourcesVarargs(value: TfvcMergeSource*): Self = this.set("mergeSources", js.Array(value :_*))
    @scala.inline
    def setMergeSources(value: js.Array[TfvcMergeSource]): Self = this.set("mergeSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingVersion(value: Double): Self = this.set("pendingVersion", value.asInstanceOf[js.Any])
  }
  
}

