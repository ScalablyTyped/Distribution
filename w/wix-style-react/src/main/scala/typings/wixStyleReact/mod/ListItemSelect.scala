package typings.wixStyleReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.listItemSelectMod.ListItemSelectProps
import typings.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "ListItemSelect")
@js.native
class ListItemSelect protected ()
  extends Component[ListItemSelectProps, ComponentState, js.Any] {
  def this(props: ListItemSelectProps) = this()
  def this(props: ListItemSelectProps, context: js.Any) = this()
}
object ListItemSelect {
  
  @scala.inline
  def apply: ComponentClass[ListItemSelectProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("ListItemSelect").asInstanceOf[ComponentClass[ListItemSelectProps, ComponentState]]
}
