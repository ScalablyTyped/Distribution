package typings.webtorrent.mod

import typings.webtorrent.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TorrentOptions extends js.Object {
  
  var announce: js.UndefOr[js.Array[_]] = js.native
  
  var getAnnounceOpts: js.UndefOr[js.Function0[Unit]] = js.native
  
  var maxWebConns: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
  
  var store: js.UndefOr[js.Function2[/* chunkLength */ Double, /* storeOpts */ Files, _]] = js.native
}
object TorrentOptions {
  
  @scala.inline
  def apply(): TorrentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TorrentOptions]
  }
  
  @scala.inline
  implicit class TorrentOptionsOps[Self <: TorrentOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnounceVarargs(value: js.Any*): Self = this.set("announce", js.Array(value :_*))
    
    @scala.inline
    def setAnnounce(value: js.Array[_]): Self = this.set("announce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnounce: Self = this.set("announce", js.undefined)
    
    @scala.inline
    def setGetAnnounceOpts(value: () => Unit): Self = this.set("getAnnounceOpts", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAnnounceOpts: Self = this.set("getAnnounceOpts", js.undefined)
    
    @scala.inline
    def setMaxWebConns(value: Double): Self = this.set("maxWebConns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWebConns: Self = this.set("maxWebConns", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setStore(value: (/* chunkLength */ Double, /* storeOpts */ Files) => _): Self = this.set("store", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
}
