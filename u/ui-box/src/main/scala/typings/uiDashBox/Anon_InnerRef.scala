package typings.uiDashBox

import typings.react.reactMod.Ref
import typings.uiDashBox.distTypesBoxDashTypesMod.Is
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InnerRef[T /* <: Is[_] */] extends js.Object {
  /**
    * Callback that gets passed a ref to inner DOM node (or component if the
    * `is` prop is set to a React component type).
    */
  var innerRef: js.UndefOr[Ref[T]] = js.undefined
  /**
    * Replaces the underlying element
    */
  var is: js.UndefOr[T] = js.undefined
}

object Anon_InnerRef {
  @scala.inline
  def apply[T /* <: Is[_] */](innerRef: Ref[T] = null, is: T = null): Anon_InnerRef[T] = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InnerRef[T]]
  }
}

