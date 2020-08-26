package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelClientPermSidEntry extends ResponseEntry {
  var cid: String = js.native
  var cldbid: String = js.native
  var permnegated: Boolean = js.native
  var permsid: String = js.native
  var permskip: Boolean = js.native
  var permvalue: Double = js.native
}

object ChannelClientPermSidEntry {
  @scala.inline
  def apply(
    cid: String,
    cldbid: String,
    permnegated: Boolean,
    permsid: String,
    permskip: Boolean,
    permvalue: Double
  ): ChannelClientPermSidEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelClientPermSidEntry]
  }
  @scala.inline
  implicit class ChannelClientPermSidEntryOps[Self <: ChannelClientPermSidEntry] (val x: Self) extends AnyVal {
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
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCldbid(value: String): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermnegated(value: Boolean): Self = this.set("permnegated", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermsid(value: String): Self = this.set("permsid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermskip(value: Boolean): Self = this.set("permskip", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermvalue(value: Double): Self = this.set("permvalue", value.asInstanceOf[js.Any])
  }
  
}

