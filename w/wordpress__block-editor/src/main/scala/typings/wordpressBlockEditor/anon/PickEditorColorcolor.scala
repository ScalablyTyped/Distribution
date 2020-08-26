package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@wordpress/block-editor.@wordpress/block-editor.EditorColor, 'color'> */
@js.native
trait PickEditorColorcolor extends js.Object {
  var color: String = js.native
}

object PickEditorColorcolor {
  @scala.inline
  def apply(color: String): PickEditorColorcolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickEditorColorcolor]
  }
  @scala.inline
  implicit class PickEditorColorcolorOps[Self <: PickEditorColorcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
  }
  
}

