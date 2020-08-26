package typings.wordpressComponents.anon

import typings.wordpressComponents.cardMod.Card.CardSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsElevated[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends js.Object {
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.native
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Renders a borderless card.
    */
  var isBorderless: js.UndefOr[Boolean] = js.native
  /**
    * Renders an elevated card.
    */
  var isElevated: js.UndefOr[Boolean] = js.native
  /**
    * Determines the amount of padding within the card.
    *
    * @defaultValue "medium"
    */
  var size: js.UndefOr[CardSize] = js.native
}

object IsElevated {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 * / js.Any */ T](): IsElevated[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsElevated[T]]
  }
  @scala.inline
  implicit class IsElevatedOps[Self <: IsElevated[_], /* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 * / js.Any */ T] (val x: Self with IsElevated[T]) extends AnyVal {
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
    def setIsBorderless(value: Boolean): Self = this.set("isBorderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBorderless: Self = this.set("isBorderless", js.undefined)
    @scala.inline
    def setIsElevated(value: Boolean): Self = this.set("isElevated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsElevated: Self = this.set("isElevated", js.undefined)
    @scala.inline
    def setSize(value: CardSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

