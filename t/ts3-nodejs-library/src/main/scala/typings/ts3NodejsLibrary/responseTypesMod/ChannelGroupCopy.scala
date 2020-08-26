package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelGroupCopy extends ResponseEntry {
  /** only available when a new group gets created */
  var cgid: js.UndefOr[String] = js.native
}

object ChannelGroupCopy {
  @scala.inline
  def apply(): ChannelGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupCopy]
  }
  @scala.inline
  implicit class ChannelGroupCopyOps[Self <: ChannelGroupCopy] (val x: Self) extends AnyVal {
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
    def setCgid(value: String): Self = this.set("cgid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCgid: Self = this.set("cgid", js.undefined)
  }
  
}

