package typings.typestubIpfs.mod

import typings.node.Buffer
import typings.typestubIpfs.typestubIpfsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPFSGetResult extends js.Object {
  var content: Buffer = js.native
  var depth: Double = js.native
  var hash: Buffer = js.native
  var name: String = js.native
  var path: String = js.native
  var size: Double = js.native
  var `type`: file | String = js.native
}

object IPFSGetResult {
  @scala.inline
  def apply(
    content: Buffer,
    depth: Double,
    hash: Buffer,
    name: String,
    path: String,
    size: Double,
    `type`: file | String
  ): IPFSGetResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSGetResult]
  }
  @scala.inline
  implicit class IPFSGetResultOps[Self <: IPFSGetResult] (val x: Self) extends AnyVal {
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
    def setContent(value: Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: Buffer): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: file | String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

