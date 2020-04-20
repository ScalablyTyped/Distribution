package typings.vue2Editor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorData extends js.Object {
  var quill: js.Any
}

object VueEditorData {
  @scala.inline
  def apply(quill: js.Any): VueEditorData = {
    val __obj = js.Dynamic.literal(quill = quill.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueEditorData]
  }
}

