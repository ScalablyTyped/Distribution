package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** A recognized capture group for a pattern-based entity. */
@js.native
trait CaptureGroup extends js.Object {
  /** A recognized capture group for the entity. */
  var group: String = js.native
  /** Zero-based character offsets that indicate where the entity value begins and ends in the input text. */
  var location: js.UndefOr[js.Array[Double]] = js.native
}

object CaptureGroup {
  @scala.inline
  def apply(group: String): CaptureGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureGroup]
  }
  @scala.inline
  implicit class CaptureGroupOps[Self <: CaptureGroup] (val x: Self) extends AnyVal {
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

