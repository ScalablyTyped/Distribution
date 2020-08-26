package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignSelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value.
    *
    * If any of the item's cross-axis margin is set to auto, then align-self is ignored. In Grid layout align-self
    * aligns the item inside the grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self)
    */
  var alignSelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AlignSelfProperty */ _, 
      ThemeType
    ]
  ] = js.native
}

object AlignSelfProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): AlignSelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignSelfProps[ThemeType]]
  }
  @scala.inline
  implicit class AlignSelfPropsOps[Self <: AlignSelfProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with AlignSelfProps[ThemeType]) extends AnyVal {
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
    def setAlignSelfVarargs(value: (js.Any | Null)*): Self = this.set("alignSelf", js.Array(value :_*))
    @scala.inline
    def setAlignSelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AlignSelfProperty */ _, 
          ThemeType
        ]
    ): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAlignSelfNull: Self = this.set("alignSelf", null)
  }
  
}

