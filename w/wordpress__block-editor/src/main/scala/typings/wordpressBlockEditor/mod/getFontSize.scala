package typings.wordpressBlockEditor.mod

import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor", "getFontSize")
@js.native
object getFontSize extends js.Object {
  def apply(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[String],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
}

