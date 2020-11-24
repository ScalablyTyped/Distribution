package typings.webtorrent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TorrentDestroyOptions extends js.Object {
  
  var destroyStore: js.UndefOr[Boolean] = js.native
}
object TorrentDestroyOptions {
  
  @scala.inline
  def apply(): TorrentDestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TorrentDestroyOptions]
  }
  
  @scala.inline
  implicit class TorrentDestroyOptionsOps[Self <: TorrentDestroyOptions] (val x: Self) extends AnyVal {
    
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
    def setDestroyStore(value: Boolean): Self = this.set("destroyStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyStore: Self = this.set("destroyStore", js.undefined)
  }
}
