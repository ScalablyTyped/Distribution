package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaInfo extends js.Object {
  var owner: webgmeLib.CoreNs.Node
  var ownerPath: Path
  var target: webgmeLib.CoreNs.Node
  var targetPath: Path
}

object MetaInfo {
  @scala.inline
  def apply(owner: webgmeLib.CoreNs.Node, ownerPath: Path, target: webgmeLib.CoreNs.Node, targetPath: Path): MetaInfo = {
    val __obj = js.Dynamic.literal(owner = owner, ownerPath = ownerPath, target = target, targetPath = targetPath)
  
    __obj.asInstanceOf[MetaInfo]
  }
}

