package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPFSFile extends js.Object {
  var content: js.UndefOr[FileContent] = js.undefined
  var hash: String
  var path: String
  var size: Double
}

object IPFSFile {
  @scala.inline
  def apply(hash: String, path: String, size: Double, content: FileContent = null): IPFSFile = {
    val __obj = js.Dynamic.literal(hash = hash, path = path, size = size)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSFile]
  }
}

