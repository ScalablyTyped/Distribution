package typings.wordpressEditor.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.providerMod.EditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditorProvider extends Shortcut {
  
  @JSImport("@wordpress/editor", "EditorProvider")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `EditorProvider.foo` */
  override def _to: ComponentType[Props] = ^
}
