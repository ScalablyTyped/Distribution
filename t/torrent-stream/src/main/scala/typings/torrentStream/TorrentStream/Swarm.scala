package typings.torrentStream.TorrentStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swarm extends js.Object {
  
  var downloaded: Double = js.native
}
object Swarm {
  
  @scala.inline
  def apply(downloaded: Double): Swarm = {
    val __obj = js.Dynamic.literal(downloaded = downloaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swarm]
  }
  
  @scala.inline
  implicit class SwarmOps[Self <: Swarm] (val x: Self) extends AnyVal {
    
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
    def setDownloaded(value: Double): Self = this.set("downloaded", value.asInstanceOf[js.Any])
  }
}
