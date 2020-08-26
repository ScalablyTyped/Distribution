package typings.wordpressComponents.anon

import typings.wordpressComponents.cardMod.Card.CardSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends js.Object {
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.native
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Add visual shading style.
    */
  var isShady: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[CardSize] = js.native
}

object As {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 * / js.Any */ T](): As[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[T]]
  }
  @scala.inline
  implicit class AsOps[Self <: As[_], /* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 * / js.Any */ T] (val x: Self with As[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAs(value: T): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIsShady(value: Boolean): Self = this.set("isShady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsShady: Self = this.set("isShady", js.undefined)
    @scala.inline
    def setSize(value: CardSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

