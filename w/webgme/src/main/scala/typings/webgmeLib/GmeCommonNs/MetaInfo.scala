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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("ownerPath")(ownerPath)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("targetPath")(targetPath)
    __obj.asInstanceOf[MetaInfo]
  }
}

