package typings.wixStyleReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.distTypesMobilePreviewWidgetMod.MobilePreviewWidgetProps
import typings.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "MobilePreviewWidget")
@js.native
open class MobilePreviewWidget protected () extends Component[MobilePreviewWidgetProps, ComponentState, Any] {
  def this(props: MobilePreviewWidgetProps) = this()
  def this(props: MobilePreviewWidgetProps, context: Any) = this()
}
object MobilePreviewWidget {
  
  inline def apply: ComponentClass[MobilePreviewWidgetProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("MobilePreviewWidget").asInstanceOf[ComponentClass[MobilePreviewWidgetProps, ComponentState]]
}
