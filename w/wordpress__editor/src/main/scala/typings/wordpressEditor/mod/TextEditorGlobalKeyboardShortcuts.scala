package typings.wordpressEditor.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.textEditorShortcutsMod.TextEditorGlobalKeyboardShortcuts.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextEditorGlobalKeyboardShortcuts extends Shortcut {
  
  @JSImport("@wordpress/editor", "TextEditorGlobalKeyboardShortcuts")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `TextEditorGlobalKeyboardShortcuts.foo` */
  override def _to: ComponentType[Props] = ^
}
