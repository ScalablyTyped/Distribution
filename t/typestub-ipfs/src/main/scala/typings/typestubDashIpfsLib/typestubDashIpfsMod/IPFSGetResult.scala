package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPFSGetResult extends js.Object {
  var content: nodeLib.Buffer
  var depth: scala.Double
  var hash: nodeLib.Buffer
  var name: java.lang.String
  var path: java.lang.String
  var size: scala.Double
  var `type`: typestubDashIpfsLib.typestubDashIpfsLibStrings.file | java.lang.String
}

object IPFSGetResult {
  @scala.inline
  def apply(
    content: nodeLib.Buffer,
    depth: scala.Double,
    hash: nodeLib.Buffer,
    name: java.lang.String,
    path: java.lang.String,
    size: scala.Double,
    `type`: typestubDashIpfsLib.typestubDashIpfsLibStrings.file | java.lang.String
  ): IPFSGetResult = {
    val __obj = js.Dynamic.literal(content = content, depth = depth, hash = hash, name = name, path = path, size = size)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSGetResult]
  }
}

