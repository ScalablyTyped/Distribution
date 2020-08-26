package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.wordpressComponents.menuMod.NavigableMenu.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/navigable-container", JSImport.Namespace)
@js.native
object navigableContainerMod extends js.Object {
  @js.native
  object NavigableMenu extends TopLevel[ComponentType[Props]]
  
  @js.native
  object TabbableContainer
    extends TopLevel[ComponentType[typings.wordpressComponents.tabbableMod.TabbableContainer.Props]]
  
}

