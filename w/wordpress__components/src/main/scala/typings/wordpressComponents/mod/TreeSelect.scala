package typings.wordpressComponents.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.treeSelectMod.TreeSelect.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeSelect extends Shortcut {
  
  @JSImport("@wordpress/components", "TreeSelect")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `TreeSelect.foo` */
  override def _to: ComponentType[Props] = ^
}
