package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ChannelGroupEntry> */
@js.native
trait PartialChannelGroupEntry extends js.Object {
  var cgid: js.UndefOr[String] = js.native
  var iconid: js.UndefOr[String] = js.native
  var nMemberAddp: js.UndefOr[Double] = js.native
  var nMemberRemovep: js.UndefOr[Double] = js.native
  var nModifyp: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var namemode: js.UndefOr[Double] = js.native
  var savedb: js.UndefOr[Double] = js.native
  var sortid: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Double] = js.native
}

object PartialChannelGroupEntry {
  @scala.inline
  def apply(): PartialChannelGroupEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChannelGroupEntry]
  }
  @scala.inline
  implicit class PartialChannelGroupEntryOps[Self <: PartialChannelGroupEntry] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setIconid(value: String): Self = this.set("iconid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconid: Self = this.set("iconid", js.undefined)
    @scala.inline
    def setNMemberAddp(value: Double): Self = this.set("nMemberAddp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNMemberAddp: Self = this.set("nMemberAddp", js.undefined)
    @scala.inline
    def setNMemberRemovep(value: Double): Self = this.set("nMemberRemovep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNMemberRemovep: Self = this.set("nMemberRemovep", js.undefined)
    @scala.inline
    def setNModifyp(value: Double): Self = this.set("nModifyp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNModifyp: Self = this.set("nModifyp", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamemode(value: Double): Self = this.set("namemode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamemode: Self = this.set("namemode", js.undefined)
    @scala.inline
    def setSavedb(value: Double): Self = this.set("savedb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedb: Self = this.set("savedb", js.undefined)
    @scala.inline
    def setSortid(value: Double): Self = this.set("sortid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortid: Self = this.set("sortid", js.undefined)
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

