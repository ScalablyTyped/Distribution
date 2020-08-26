package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifySelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-self property set the way a box is justified inside its alignment container along
    * the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self)
    */
  var justifySelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifySelfProperty */ _, 
      ThemeType
    ]
  ] = js.native
}

object JustifySelfProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): JustifySelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps[ThemeType]]
  }
  @scala.inline
  implicit class JustifySelfPropsOps[Self <: JustifySelfProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with JustifySelfProps[ThemeType]) extends AnyVal {
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
    def setJustifySelfVarargs(value: (js.Any | Null)*): Self = this.set("justifySelf", js.Array(value :_*))
    @scala.inline
    def setJustifySelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifySelfProperty */ _, 
          ThemeType
        ]
    ): Self = this.set("justifySelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifySelf: Self = this.set("justifySelf", js.undefined)
    @scala.inline
    def setJustifySelfNull: Self = this.set("justifySelf", null)
  }
  
}

