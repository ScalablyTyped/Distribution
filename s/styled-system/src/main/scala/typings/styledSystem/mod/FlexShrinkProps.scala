package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexShrinkProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-shrink CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger
    * than the flex container, items shrink to fit according to flex-shrink.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink)
    */
  var flexShrink: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
      ThemeType
    ]
  ] = js.native
}

object FlexShrinkProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): FlexShrinkProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps[ThemeType]]
  }
  @scala.inline
  implicit class FlexShrinkPropsOps[Self <: FlexShrinkProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with FlexShrinkProps[ThemeType]) extends AnyVal {
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
    def setFlexShrinkVarargs(value: (js.Any | Null)*): Self = this.set("flexShrink", js.Array(value :_*))
    @scala.inline
    def setFlexShrink(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          ThemeType
        ]
    ): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
    @scala.inline
    def setFlexShrinkNull: Self = this.set("flexShrink", null)
  }
  
}

