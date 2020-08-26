package typings.wordpressEditor.mod

import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.mod.EditorFontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor", "getFontSize")
@js.native
object getFontSize extends js.Object {
  def apply(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[scala.Nothing],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
  def apply(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = js.native
}

