package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
    * are sorted by ascending order value and then by their source code order.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
    */
  var order: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
      ThemeType
    ]
  ] = js.native
}

object OrderProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): OrderProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderProps[ThemeType]]
  }
  @scala.inline
  implicit class OrderPropsOps[Self <: OrderProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with OrderProps[ThemeType]) extends AnyVal {
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
    def setOrderVarargs(value: (js.Any | Null)*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          ThemeType
        ]
    ): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
  }
  
}

