package typings.wixStyleReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.distTypesPreviewWidgetMod.PreviewWidgetProps
import typings.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "PreviewWidget")
@js.native
open class PreviewWidget protected () extends Component[PreviewWidgetProps, ComponentState, Any] {
  def this(props: PreviewWidgetProps) = this()
  def this(props: PreviewWidgetProps, context: Any) = this()
}
object PreviewWidget {
  
  inline def apply: ComponentClass[PreviewWidgetProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("PreviewWidget").asInstanceOf[ComponentClass[PreviewWidgetProps, ComponentState]]
}
