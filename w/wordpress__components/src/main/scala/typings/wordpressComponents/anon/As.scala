package typings.wordpressComponents.anon

import typings.wordpressComponents.cardMod.Card.CardSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait As[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends js.Object {
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.undefined
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Add visual shading style.
    */
  var isShady: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[CardSize] = js.undefined
}

object As {
  @scala.inline
  def apply[T](
    as: T = null,
    className: String = null,
    isShady: js.UndefOr[Boolean] = js.undefined,
    size: CardSize = null
  ): As[T] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isShady)) __obj.updateDynamic("isShady")(isShady.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[As[T]]
  }
}

