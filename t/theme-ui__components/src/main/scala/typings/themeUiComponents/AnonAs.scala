package typings.themeUiComponents

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs[T /* <: ElementType[_] */] extends js.Object {
  /**
    * form control to render, default Input
    */
  var as: js.UndefOr[T] = js.undefined
}

object AnonAs {
  @scala.inline
  def apply[T /* <: ElementType[_] */](as: T = null): AnonAs[T] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAs[T]]
  }
}

