package typings.webgme.GmeCommon

import typings.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaInfo extends js.Object {
  var owner: Node
  var ownerPath: Path
  var target: Node
  var targetPath: Path
}

object MetaInfo {
  @scala.inline
  def apply(owner: Node, ownerPath: Path, target: Node, targetPath: Path): MetaInfo = {
    val __obj = js.Dynamic.literal(owner = owner, ownerPath = ownerPath, target = target, targetPath = targetPath)
  
    __obj.asInstanceOf[MetaInfo]
  }
}

