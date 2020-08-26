package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BackgroundImageProps[ThemeType]
     with BackgroundSizeProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BackgroundSizeProperty<TLengthStyledSystem> */ js.Any
    ]
     with BackgroundPositionProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BackgroundPositionProperty<TLengthStyledSystem> */ js.Any
    ]
     with BackgroundRepeatProps[ThemeType] {
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BackgroundProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): BackgroundProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BackgroundPropsOps[Self <: BackgroundProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (BackgroundProps[ThemeType, TVal])) extends AnyVal {
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
    def setBackgroundVarargs(value: (TVal | Null)*): Self = this.set("background", js.Array(value :_*))
    @scala.inline
    def setBackground(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundNull: Self = this.set("background", null)
  }
  
}

