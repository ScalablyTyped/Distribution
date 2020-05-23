package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorFontSize> & std.Pick<@wordpress/block-editor.@wordpress/block-editor.EditorFontSize, 'size'> */
trait PartialEditorFontSizePick extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
}

object PartialEditorFontSizePick {
  @scala.inline
  def apply(name: String = null, size: js.UndefOr[Double] = js.undefined, slug: String = null): PartialEditorFontSizePick = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEditorFontSizePick]
  }
}

