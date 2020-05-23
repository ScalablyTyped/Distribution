package typings.wordpressBlockEditor.richTextMod.RichTextShortcut

import typings.wordpressBlockEditor.wordpressBlockEditorStrings.access
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.alt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ctrl
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ctrlShift
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.primary
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.primaryAlt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.primaryShift
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.secondary
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.shift
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.shiftAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var character: String
  var `type`: /* keyof @wordpress/block-editor.anon.Access */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  def onUse(): Unit
}

object Props {
  @scala.inline
  def apply(
    character: String,
    onUse: () => Unit,
    `type`: /* keyof @wordpress/block-editor.anon.Access */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  ): Props = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], onUse = js.Any.fromFunction0(onUse))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

