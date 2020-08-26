package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacityProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
      ThemeType
    ]
  ] = js.native
}

object OpacityProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): OpacityProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps[ThemeType]]
  }
  @scala.inline
  implicit class OpacityPropsOps[Self <: OpacityProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with OpacityProps[ThemeType]) extends AnyVal {
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
    def setOpacityVarargs(value: (js.Any | Null)*): Self = this.set("opacity", js.Array(value :_*))
    @scala.inline
    def setOpacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          ThemeType
        ]
    ): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOpacityNull: Self = this.set("opacity", null)
  }
  
}

