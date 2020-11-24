package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelGroupClientEntry extends ResponseEntry {
  
  var cgid: js.UndefOr[String] = js.native
  
  var cid: js.UndefOr[String] = js.native
  
  var cldbid: js.UndefOr[String] = js.native
}
object ChannelGroupClientEntry {
  
  @scala.inline
  def apply(): ChannelGroupClientEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupClientEntry]
  }
  
  @scala.inline
  implicit class ChannelGroupClientEntryOps[Self <: ChannelGroupClientEntry] (val x: Self) extends AnyVal {
    
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
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setCldbid(value: String): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCldbid: Self = this.set("cldbid", js.undefined)
  }
}
