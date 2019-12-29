package typings.atThemeDashUiComponents

import typings.react.reactMod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As[T /* <: ElementType[_] */] extends js.Object {
  /**
    * form control to render, default Input
    */
  var as: js.UndefOr[T] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply[T /* <: ElementType[_] */](as: T = null): Anon_As[T] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_As[T]]
  }
}

