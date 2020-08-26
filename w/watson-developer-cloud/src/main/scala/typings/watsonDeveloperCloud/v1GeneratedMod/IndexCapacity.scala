package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about the resource usage and capacity of the environment. */
@js.native
trait IndexCapacity extends js.Object {
  /** Summary of the collection usage in the environment. */
  var collections: js.UndefOr[CollectionUsage] = js.native
  /** Summary of the disk usage statistics for the environment. */
  var disk_usage: js.UndefOr[DiskUsage] = js.native
  /** Summary of the document usage statistics for the environment. */
  var documents: js.UndefOr[EnvironmentDocuments] = js.native
}

object IndexCapacity {
  @scala.inline
  def apply(): IndexCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexCapacity]
  }
  @scala.inline
  implicit class IndexCapacityOps[Self <: IndexCapacity] (val x: Self) extends AnyVal {
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
    def setCollections(value: CollectionUsage): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollections: Self = this.set("collections", js.undefined)
    @scala.inline
    def setDisk_usage(value: DiskUsage): Self = this.set("disk_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisk_usage: Self = this.set("disk_usage", js.undefined)
    @scala.inline
    def setDocuments(value: EnvironmentDocuments): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
  }
  
}

