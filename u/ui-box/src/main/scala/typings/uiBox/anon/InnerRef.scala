package typings.uiBox.anon

import typings.react.mod.RefObject
import typings.uiBox.boxTypesMod.Is
import typings.uiBox.boxTypesMod.RefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerRef[T /* <: Is[_] */] extends js.Object {
  /**
    * Callback that gets passed a ref to inner DOM node (or component if the
    * `is` prop is set to a React component type).
    */
  var innerRef: js.UndefOr[(js.Function1[/* ref */ RefType[T], Unit]) | RefObject[RefType[T]]] = js.undefined
  /**
    * Replaces the underlying element
    */
  var is: js.UndefOr[T] = js.undefined
}

object InnerRef {
  @scala.inline
  def apply[T](innerRef: (js.Function1[/* ref */ RefType[T], Unit]) | RefObject[RefType[T]] = null, is: T = null): InnerRef[T] = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerRef[T]]
  }
}

