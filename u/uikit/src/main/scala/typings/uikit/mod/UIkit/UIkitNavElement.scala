package typings.uikit.mod.UIkit

import typings.uikit.mod.UIkitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitNavElement extends js.Object {
  var animate: Boolean
  var index: String | Double | UIkitNode
}

object UIkitNavElement {
  @scala.inline
  def apply(animate: Boolean, index: String | Double | UIkitNode): UIkitNavElement = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNavElement]
  }
}

