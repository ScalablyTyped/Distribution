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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var character: String = js.native
  
  def onUse(): Unit = js.native
  
  var `type`: /* keyof @wordpress/block-editor.anon.Access */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt = js.native
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
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setCharacter(value: String): Self = this.set("character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUse(value: () => Unit): Self = this.set("onUse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(
      value: /* keyof @wordpress/block-editor.anon.Access */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
