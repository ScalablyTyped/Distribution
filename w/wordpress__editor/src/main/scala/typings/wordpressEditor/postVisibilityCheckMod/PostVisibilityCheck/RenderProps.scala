package typings.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var canEdit: Boolean
}

object RenderProps {
  @scala.inline
  def apply(canEdit: Boolean): RenderProps = {
    val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

