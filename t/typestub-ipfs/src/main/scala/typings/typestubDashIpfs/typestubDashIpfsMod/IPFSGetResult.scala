package typings.typestubDashIpfs.typestubDashIpfsMod

import typings.node.Buffer
import typings.typestubDashIpfs.typestubDashIpfsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPFSGetResult extends js.Object {
  var content: Buffer
  var depth: Double
  var hash: Buffer
  var name: String
  var path: String
  var size: Double
  var `type`: file | String
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
}

