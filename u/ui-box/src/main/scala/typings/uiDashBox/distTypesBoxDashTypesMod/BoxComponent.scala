package typings.uiDashBox.distTypesBoxDashTypesMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxComponent extends js.Object {
  var defaultProps: js.UndefOr[Partial[js.Object]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[js.Object]] = js.native
  def apply[T /* <: Is[_] */](props: BoxProps[T]): ReactElement | Null = js.native
}

