package typings.wixStyleReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.distTypesBrowserPreviewWidgetMod.BrowserPreviewWidgetProps
import typings.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "BrowserPreviewWidget")
@js.native
open class BrowserPreviewWidget protected () extends Component[BrowserPreviewWidgetProps, ComponentState, Any] {
  def this(props: BrowserPreviewWidgetProps) = this()
  def this(props: BrowserPreviewWidgetProps, context: Any) = this()
}
object BrowserPreviewWidget {
  
  inline def apply: ComponentClass[BrowserPreviewWidgetProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("BrowserPreviewWidget").asInstanceOf[ComponentClass[BrowserPreviewWidgetProps, ComponentState]]
}
