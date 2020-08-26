package typings.wordpressNux.selectorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuideInfo extends js.Object {
  /**
    * The guide's currently showing tip.
    */
  var currentTipId: js.UndefOr[String] = js.native
  /**
    * The guide's next tip to show.
    */
  var nextTipId: js.UndefOr[String] = js.native
  /**
    * Which tips the guide contains.
    */
  var tipIds: js.Array[String] = js.native
}

object GuideInfo {
  @scala.inline
  def apply(tipIds: js.Array[String]): GuideInfo = {
    val __obj = js.Dynamic.literal(tipIds = tipIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuideInfo]
  }
  @scala.inline
  implicit class GuideInfoOps[Self <: GuideInfo] (val x: Self) extends AnyVal {
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
    def setTipIdsVarargs(value: String*): Self = this.set("tipIds", js.Array(value :_*))
    @scala.inline
    def setTipIds(value: js.Array[String]): Self = this.set("tipIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTipId(value: String): Self = this.set("currentTipId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTipId: Self = this.set("currentTipId", js.undefined)
    @scala.inline
    def setNextTipId(value: String): Self = this.set("nextTipId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextTipId: Self = this.set("nextTipId", js.undefined)
  }
  
}

