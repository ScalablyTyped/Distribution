package typings.styletronReact.mod

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FC<P & styletron-react.styletron-react.StyletronComponentInjectedProps<P>> & {  __STYLETRON__  :styletron-react.styletron-react.Styletron} */
@js.native
trait StyletronComponent[P /* <: js.Object */] extends js.Object {
  var __STYLETRON__ : Styletron = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[P with StyletronComponentInjectedProps[P]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[P with StyletronComponentInjectedProps[P]]] = js.native
  def apply(props: PropsWithChildren[P with StyletronComponentInjectedProps[P]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[P with StyletronComponentInjectedProps[P]], context: js.Any): ReactElement | Null = js.native
}

