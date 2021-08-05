package typings.wixUiCore.wixUiCoreSrcMod

import typings.wixUiCore.srcComponentsDropdownDropdownMod.DropdownComponent
import typings.wixUiCore.srcComponentsDropdownDropdownMod.DropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-ui-core/src", "Dropdown")
@js.native
class Dropdown protected () extends DropdownComponent {
  def this(props: DropdownProps) = this()
}
object Dropdown {
  
  @JSImport("wix-ui-core/src", "Dropdown")
  @js.native
  val ^ : js.Any = js.native
  
  inline def areSelectedIdsEqual(selectedIds1: js.Any, selectedIds2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSelectedIdsEqual")(selectedIds1.asInstanceOf[js.Any], selectedIds2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("wix-ui-core/src", "Dropdown.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
