package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineReference extends js.Object {
  /**
    * The change ID.
    */
  var changeId: Double = js.native
  /**
    * The ID of the timeline.
    */
  var id: String = js.native
  /**
    * The REST URL of the timeline.
    */
  var url: String = js.native
}

object TimelineReference {
  @scala.inline
  def apply(changeId: Double, id: String, url: String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineReference]
  }
  @scala.inline
  implicit class TimelineReferenceOps[Self <: TimelineReference] (val x: Self) extends AnyVal {
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
    def setChangeId(value: Double): Self = this.set("changeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

