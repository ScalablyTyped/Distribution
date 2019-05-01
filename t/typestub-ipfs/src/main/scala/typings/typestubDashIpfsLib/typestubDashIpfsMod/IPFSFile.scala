package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPFSFile extends js.Object {
  var content: js.UndefOr[FileContent] = js.undefined
  var hash: java.lang.String
  var path: java.lang.String
  var size: scala.Double
}

object IPFSFile {
  @scala.inline
  def apply(hash: java.lang.String, path: java.lang.String, size: scala.Double, content: FileContent = null): IPFSFile = {
    val __obj = js.Dynamic.literal(hash = hash, path = path, size = size)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSFile]
  }
}

