package typings.wixDashStyleDashReact

import typings.react.reactMod.Component
import typings.react.reactMod.SFC
import typings.wixDashStyleDashReact.baseComponentsMod.WixComponentProps
import typings.wixDashStyleDashReact.buttonMod.ButtonProps
import typings.wixDashStyleDashReact.loaderMod.LoaderProps
import typings.wixDashStyleDashReact.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wix-style-react", JSImport.Namespace)
@js.native
object wixDashStyleDashReactMod extends js.Object {
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class Loader ()
    extends Component[LoaderProps, js.Object, js.Any]
  
  @js.native
  class WixComponent[T /* <: WixComponentProps */] ()
    extends Component[T, js.Object, js.Any]
  
  val Text: SFC[TextProps] = js.native
}

