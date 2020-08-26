package typings.webtorrent.anon

import typings.std.File
import typings.webtorrent.mod.Torrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Files extends js.Object {
  var files: js.Array[File] = js.native
  var length: Double = js.native
  var torrent: Torrent = js.native
}

object Files {
  @scala.inline
  def apply(files: js.Array[File], length: Double, torrent: Torrent): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setTorrent(value: Torrent): Self = this.set("torrent", value.asInstanceOf[js.Any])
  }
  
}

