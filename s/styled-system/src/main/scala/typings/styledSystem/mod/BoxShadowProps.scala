package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The box-shadow CSS property adds shadow effects around an element's frame. You can set multiple effects separated
    * by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow)
    */
  var boxShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _) | Double, 
      ThemeType
    ]
  ] = js.native
}

object BoxShadowProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): BoxShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps[ThemeType]]
  }
  @scala.inline
  implicit class BoxShadowPropsOps[Self <: BoxShadowProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with BoxShadowProps[ThemeType]) extends AnyVal {
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
    def setBoxShadowVarargs(value: ((js.Any | Double) | Null)*): Self = this.set("boxShadow", js.Array(value :_*))
    @scala.inline
    def setBoxShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _) | Double, 
          ThemeType
        ]
    ): Self = this.set("boxShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxShadow: Self = this.set("boxShadow", js.undefined)
    @scala.inline
    def setBoxShadowNull: Self = this.set("boxShadow", null)
  }
  
}

