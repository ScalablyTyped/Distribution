package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexGrowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-grow CSS property sets the flex grow factor of a flex item main size. It specifies how much of the
    * remaining space in the flex container should be assigned to the item (the flex grow factor).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow)
    */
  var flexGrow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
      ThemeType
    ]
  ] = js.native
}

object FlexGrowProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): FlexGrowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps[ThemeType]]
  }
  @scala.inline
  implicit class FlexGrowPropsOps[Self <: FlexGrowProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with FlexGrowProps[ThemeType]) extends AnyVal {
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
    def setFlexGrowVarargs(value: (js.Any | Null)*): Self = this.set("flexGrow", js.Array(value :_*))
    @scala.inline
    def setFlexGrow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          ThemeType
        ]
    ): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    @scala.inline
    def setFlexGrowNull: Self = this.set("flexGrow", null)
  }
  
}

