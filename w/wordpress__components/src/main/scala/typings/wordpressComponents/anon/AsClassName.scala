package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsClassName[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends js.Object {
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
}

object AsClassName {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 * / js.Any */ T](as: T = null, className: String = null): AsClassName[T] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsClassName[T]]
  }
}

