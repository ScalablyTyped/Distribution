package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.vegaDashTypingsStrings.treelinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeLinksTransform extends Transforms {
  var `type`: treelinks
}

object TreeLinksTransform {
  @scala.inline
  def apply(`type`: treelinks): TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TreeLinksTransform]
  }
}

