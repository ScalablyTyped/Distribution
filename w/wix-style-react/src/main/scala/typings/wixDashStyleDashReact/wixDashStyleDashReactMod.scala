package typings.wixDashStyleDashReact

import typings.react.reactMod.SFC
import typings.wixDashStyleDashReact.baseComponentsMod.WixComponentProps
import typings.wixDashStyleDashReact.buttonMod.default
import typings.wixDashStyleDashReact.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wix-style-react", JSImport.Namespace)
@js.native
object wixDashStyleDashReactMod extends js.Object {
  @js.native
  class Button () extends default
  
  @js.native
  class Loader ()
    extends typings.wixDashStyleDashReact.loaderMod.default
  
  @js.native
  class WixComponent[T /* <: WixComponentProps */] ()
    extends typings.wixDashStyleDashReact.baseComponentsMod.default[T]
  
  val Text: SFC[TextProps] = js.native
}

