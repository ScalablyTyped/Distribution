package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelClientPermIdEntry extends ResponseEntry {
  var cid: String = js.native
  var cldbid: String = js.native
  var permid: Double = js.native
  var permnegated: Boolean = js.native
  var permskip: Boolean = js.native
  var permvalue: Double = js.native
}

object ChannelClientPermIdEntry {
  @scala.inline
  def apply(
    cid: String,
    cldbid: String,
    permid: Double,
    permnegated: Boolean,
    permskip: Boolean,
    permvalue: Double
  ): ChannelClientPermIdEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelClientPermIdEntry]
  }
  @scala.inline
  implicit class ChannelClientPermIdEntryOps[Self <: ChannelClientPermIdEntry] (val x: Self) extends AnyVal {
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
    def setPermid(value: Double): Self = this.set("permid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermnegated(value: Boolean): Self = this.set("permnegated", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermskip(value: Boolean): Self = this.set("permskip", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermvalue(value: Double): Self = this.set("permvalue", value.asInstanceOf[js.Any])
  }
  
}

