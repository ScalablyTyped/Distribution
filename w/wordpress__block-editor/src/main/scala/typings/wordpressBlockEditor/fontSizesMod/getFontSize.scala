package typings.wordpressBlockEditor.fontSizesMod

import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.mod.EditorFontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components/font-sizes", "getFontSize")
@js.native
object getFontSize extends js.Object {
  def apply(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[String],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
}

