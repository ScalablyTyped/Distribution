package typings.wixStyleReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.listItemSectionMod.ListItemSectionProps
import typings.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "ListItemSection")
@js.native
class ListItemSection protected ()
  extends Component[ListItemSectionProps, ComponentState, js.Any] {
  def this(props: ListItemSectionProps) = this()
  def this(props: ListItemSectionProps, context: js.Any) = this()
}
object ListItemSection {
  
  inline def apply: ComponentClass[ListItemSectionProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("ListItemSection").asInstanceOf[ComponentClass[ListItemSectionProps, ComponentState]]
}
