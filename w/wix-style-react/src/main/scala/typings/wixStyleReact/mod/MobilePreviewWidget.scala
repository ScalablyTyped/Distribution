package typings.wixStyleReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.mobilePreviewWidgetMod.MobilePreviewWidgetProps
import typings.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "MobilePreviewWidget")
@js.native
class MobilePreviewWidget protected ()
  extends Component[MobilePreviewWidgetProps, ComponentState, js.Any] {
  def this(props: MobilePreviewWidgetProps) = this()
  def this(props: MobilePreviewWidgetProps, context: js.Any) = this()
}
object MobilePreviewWidget {
  
  @scala.inline
  def apply: ComponentClass[MobilePreviewWidgetProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("MobilePreviewWidget").asInstanceOf[ComponentClass[MobilePreviewWidgetProps, ComponentState]]
}
