package typings.wordpressComponents.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.popoverMod.Popover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover extends Shortcut {
  
  @JSImport("@wordpress/components", "Popover")
  @js.native
  val ^ : ComponentType[Props] & typings.wordpressComponents.anon.Slot = js.native
  
  type _To = ComponentType[Props] & typings.wordpressComponents.anon.Slot
  
  /* This means you don't have to write `^`, but can instead just say `Popover.foo` */
  override def _to: ComponentType[Props] & typings.wordpressComponents.anon.Slot = ^
}
