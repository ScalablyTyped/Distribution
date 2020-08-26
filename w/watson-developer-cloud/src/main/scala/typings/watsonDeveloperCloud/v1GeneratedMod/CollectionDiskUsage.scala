package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the disk usage statistics for this collection. */
@js.native
trait CollectionDiskUsage extends js.Object {
  /** Number of bytes used by the collection. */
  var used_bytes: js.UndefOr[Double] = js.native
}

object CollectionDiskUsage {
  @scala.inline
  def apply(): CollectionDiskUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDiskUsage]
  }
  @scala.inline
  implicit class CollectionDiskUsageOps[Self <: CollectionDiskUsage] (val x: Self) extends AnyVal {
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
    def setUsed_bytes(value: Double): Self = this.set("used_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsed_bytes: Self = this.set("used_bytes", js.undefined)
  }
  
}

