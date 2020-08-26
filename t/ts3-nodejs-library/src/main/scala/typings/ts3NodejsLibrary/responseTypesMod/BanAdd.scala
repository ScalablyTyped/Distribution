package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BanAdd extends ResponseEntry {
  var banid: String = js.native
}

object BanAdd {
  @scala.inline
  def apply(banid: String): BanAdd = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any])
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
    def setBanid(value: String): Self = this.set("banid", value.asInstanceOf[js.Any])
  }
  
}

