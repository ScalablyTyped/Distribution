package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifyContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-content property defines how the browser distributes space between and around content items
    * along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content)
    */
  var justifyContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifyContentProperty */ _, 
      ThemeType
    ]
  ] = js.native
}

object JustifyContentProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): JustifyContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyContentProps[ThemeType]]
  }
  @scala.inline
  implicit class JustifyContentPropsOps[Self <: JustifyContentProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with JustifyContentProps[ThemeType]) extends AnyVal {
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
    def setJustifyContentVarargs(value: (js.Any | Null)*): Self = this.set("justifyContent", js.Array(value :_*))
    @scala.inline
    def setJustifyContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifyContentProperty */ _, 
          ThemeType
        ]
    ): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setJustifyContentNull: Self = this.set("justifyContent", null)
  }
  
}

