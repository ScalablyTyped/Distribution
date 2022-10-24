package typings.wixStyleReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.distTypesListItemSectionMod.ListItemSectionProps
import typings.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "ListItemSection")
@js.native
open class ListItemSection protected () extends Component[ListItemSectionProps, ComponentState, Any] {
  def this(props: ListItemSectionProps) = this()
  def this(props: ListItemSectionProps, context: Any) = this()
}
object ListItemSection {
  
  inline def apply: ComponentClass[ListItemSectionProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("ListItemSection").asInstanceOf[ComponentClass[ListItemSectionProps, ComponentState]]
}
