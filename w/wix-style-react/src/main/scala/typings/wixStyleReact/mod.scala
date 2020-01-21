package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.SFC
import typings.wixStyleReact.baseComponentsMod.WixComponentProps
import typings.wixStyleReact.buttonMod.ButtonProps
import typings.wixStyleReact.loaderMod.LoaderProps
import typings.wixStyleReact.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wix-style-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

