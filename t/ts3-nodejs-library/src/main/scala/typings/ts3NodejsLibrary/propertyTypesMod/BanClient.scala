package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BanClient extends ResponseEntry {
  
  /** ban reason */
  var banreason: String = js.native
  
  var clid: String | js.Array[String] = js.native
  
  /** ignore errors  */
  var continueOnError: js.UndefOr[Boolean] = js.native
  
  /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
  var mytsid: js.UndefOr[String] = js.native
  
  /** bantime in seconds, if left empty it will result in a permaban */
  var time: js.UndefOr[Double] = js.native
}
object BanClient {
  
  @scala.inline
  def apply(banreason: String, clid: String | js.Array[String]): BanClient = {
    val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanClient]
  }
  
  @scala.inline
  implicit class BanClientOps[Self <: BanClient] (val x: Self) extends AnyVal {
    
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
    def setClidVarargs(value: String*): Self = this.set("clid", js.Array(value :_*))
    
    @scala.inline
    def setClid(value: String | js.Array[String]): Self = this.set("clid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinueOnError: Self = this.set("continueOnError", js.undefined)
    
    @scala.inline
    def setMytsid(value: String): Self = this.set("mytsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMytsid: Self = this.set("mytsid", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
