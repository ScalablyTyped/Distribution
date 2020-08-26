package typings.styledSystem.mod

import typings.styledSystem.styledSystemStrings.borderWidths
import typings.styledSystem.styledSystemStrings.colors
import typings.styledSystem.styledSystemStrings.radii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BorderWidthProps[ThemeType, ThemeValue[borderWidths, ThemeType, js.Any]]
     with BorderStyleProps[ThemeType]
     with BorderColorProps[ThemeType, ThemeValue[colors, ThemeType, js.Any]]
     with BorderRadiusProps[ThemeType, ThemeValue[radii, ThemeType, js.Any]]
     with BorderTopProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderTopProperty<TLengthStyledSystem> */ js.Any
    ]
     with BorderRightProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightProperty<TLengthStyledSystem> */ js.Any
    ]
     with BorderBottomProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomProperty<TLengthStyledSystem> */ js.Any
    ]
     with BorderLeftProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftProperty<TLengthStyledSystem> */ js.Any
    ] {
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  var borderX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  var borderY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): BorderProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderPropsOps[Self <: BorderProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (BorderProps[ThemeType, TVal])) extends AnyVal {
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
    def setBorderVarargs(value: (TVal | Null)*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBorderNull: Self = this.set("border", null)
    @scala.inline
    def setBorderXVarargs(value: (TVal | Null)*): Self = this.set("borderX", js.Array(value :_*))
    @scala.inline
    def setBorderX(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderX: Self = this.set("borderX", js.undefined)
    @scala.inline
    def setBorderXNull: Self = this.set("borderX", null)
    @scala.inline
    def setBorderYVarargs(value: (TVal | Null)*): Self = this.set("borderY", js.Array(value :_*))
    @scala.inline
    def setBorderY(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderY: Self = this.set("borderY", js.undefined)
    @scala.inline
    def setBorderYNull: Self = this.set("borderY", null)
  }
  
}

