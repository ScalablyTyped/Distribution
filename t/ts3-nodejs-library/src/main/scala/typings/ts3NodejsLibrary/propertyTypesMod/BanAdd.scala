package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BanAdd extends ResponseEntry {
  /** ban reason */
  var banreason: String = js.native
  /** ip regular expression */
  var ip: js.UndefOr[String] = js.native
  /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
  var mytsid: js.UndefOr[String] = js.native
  /** name regular expression */
  var name: js.UndefOr[String] = js.native
  /** bantime in seconds, if left empty it will result in a permaban */
  var time: js.UndefOr[Double] = js.native
  /** uid regular expression */
  var uid: js.UndefOr[String] = js.native
}

object BanAdd {
  @scala.inline
  def apply(banreason: String): BanAdd = {
    val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanAdd]
  }
  @scala.inline
  implicit class BanAddOps[Self <: BanAdd] (val x: Self) extends AnyVal {
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
    def setBanreason(value: String): Self = this.set("banreason", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setMytsid(value: String): Self = this.set("mytsid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMytsid: Self = this.set("mytsid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

