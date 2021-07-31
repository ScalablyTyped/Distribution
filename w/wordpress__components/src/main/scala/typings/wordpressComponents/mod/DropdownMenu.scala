package typings.wordpressComponents.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.dropdownMenuMod.DropdownMenu.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu extends Shortcut {
  
  @JSImport("@wordpress/components", "DropdownMenu")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `DropdownMenu.foo` */
  override def _to: ComponentType[Props] = ^
}
