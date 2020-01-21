package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.treelinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeLinksTransform extends _Transforms {
  var `type`: treelinks
}

object TreeLinksTransform {
  @scala.inline
  def apply(`type`: treelinks): TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeLinksTransform]
  }
}

