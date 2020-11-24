package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferDownload extends ResponseEntry {
  
  /** channel id to upload to */
  var cid: js.UndefOr[String] = js.native
  
  /** arbitary id to identify the transfer */
  var clientftfid: js.UndefOr[Double] = js.native
  
  /** channel password of the channel which will be uploaded to */
  var cpw: js.UndefOr[String] = js.native
  
  /** destination filename */
  var name: String = js.native
  
  var seekpos: js.UndefOr[Double] = js.native
}
object TransferDownload {
  
  @scala.inline
  def apply(name: String): TransferDownload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDownload]
  }
  
  @scala.inline
  implicit class TransferDownloadOps[Self <: TransferDownload] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setClientftfid(value: Double): Self = this.set("clientftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientftfid: Self = this.set("clientftfid", js.undefined)
    
    @scala.inline
    def setCpw(value: String): Self = this.set("cpw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpw: Self = this.set("cpw", js.undefined)
    
    @scala.inline
    def setSeekpos(value: Double): Self = this.set("seekpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeekpos: Self = this.set("seekpos", js.undefined)
  }
}
