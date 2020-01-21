package typings.styledReactModal.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.TemplateStringsArray
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.InterpolationFunction
import typings.styledComponents.styledComponentsMod.StyledComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-react-modal", JSImport.Default)
@js.native
class default ()
  extends Component[ModalProps, js.Object, js.Any]

/* static members */
@JSImport("styled-react-modal", JSImport.Default)
@js.native
object default extends js.Object {
  def styled(`object`: CSSObject): StyledComponent[ComponentClass[ModalProps, ComponentState], _, js.Object, scala.Nothing] = js.native
  def styled(`object`: InterpolationFunction[_]): StyledComponent[ComponentClass[ModalProps, ComponentState], _, js.Object, scala.Nothing] = js.native
  def styled(strings: TemplateStringsArray, interpolations: js.Any*): StyledComponent[ComponentClass[ModalProps, ComponentState], _, js.Object, scala.Nothing] = js.native
}

