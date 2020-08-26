package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpaceProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object SpaceProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): SpaceProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class SpacePropsOps[Self <: SpaceProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (SpaceProps[ThemeType, TVal])) extends AnyVal {
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
    def setMVarargs(value: (TVal | Null)*): Self = this.set("m", js.Array(value :_*))
    @scala.inline
    def setM(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMNull: Self = this.set("m", null)
    @scala.inline
    def setMarginVarargs(value: (TVal | Null)*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginNull: Self = this.set("margin", null)
    @scala.inline
    def setMarginBottomVarargs(value: (TVal | Null)*): Self = this.set("marginBottom", js.Array(value :_*))
    @scala.inline
    def setMarginBottom(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginBottomNull: Self = this.set("marginBottom", null)
    @scala.inline
    def setMarginLeftVarargs(value: (TVal | Null)*): Self = this.set("marginLeft", js.Array(value :_*))
    @scala.inline
    def setMarginLeft(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginLeftNull: Self = this.set("marginLeft", null)
    @scala.inline
    def setMarginRightVarargs(value: (TVal | Null)*): Self = this.set("marginRight", js.Array(value :_*))
    @scala.inline
    def setMarginRight(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginRightNull: Self = this.set("marginRight", null)
    @scala.inline
    def setMarginTopVarargs(value: (TVal | Null)*): Self = this.set("marginTop", js.Array(value :_*))
    @scala.inline
    def setMarginTop(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMarginTopNull: Self = this.set("marginTop", null)
    @scala.inline
    def setMarginXVarargs(value: (TVal | Null)*): Self = this.set("marginX", js.Array(value :_*))
    @scala.inline
    def setMarginX(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginX: Self = this.set("marginX", js.undefined)
    @scala.inline
    def setMarginXNull: Self = this.set("marginX", null)
    @scala.inline
    def setMarginYVarargs(value: (TVal | Null)*): Self = this.set("marginY", js.Array(value :_*))
    @scala.inline
    def setMarginY(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginY: Self = this.set("marginY", js.undefined)
    @scala.inline
    def setMarginYNull: Self = this.set("marginY", null)
    @scala.inline
    def setMbVarargs(value: (TVal | Null)*): Self = this.set("mb", js.Array(value :_*))
    @scala.inline
    def setMb(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setMbNull: Self = this.set("mb", null)
    @scala.inline
    def setMlVarargs(value: (TVal | Null)*): Self = this.set("ml", js.Array(value :_*))
    @scala.inline
    def setMl(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("ml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
    @scala.inline
    def setMlNull: Self = this.set("ml", null)
    @scala.inline
    def setMrVarargs(value: (TVal | Null)*): Self = this.set("mr", js.Array(value :_*))
    @scala.inline
    def setMr(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMr: Self = this.set("mr", js.undefined)
    @scala.inline
    def setMrNull: Self = this.set("mr", null)
    @scala.inline
    def setMtVarargs(value: (TVal | Null)*): Self = this.set("mt", js.Array(value :_*))
    @scala.inline
    def setMt(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setMtNull: Self = this.set("mt", null)
    @scala.inline
    def setMxVarargs(value: (TVal | Null)*): Self = this.set("mx", js.Array(value :_*))
    @scala.inline
    def setMx(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("mx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMx: Self = this.set("mx", js.undefined)
    @scala.inline
    def setMxNull: Self = this.set("mx", null)
    @scala.inline
    def setMyVarargs(value: (TVal | Null)*): Self = this.set("my", js.Array(value :_*))
    @scala.inline
    def setMy(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    @scala.inline
    def setMyNull: Self = this.set("my", null)
    @scala.inline
    def setPVarargs(value: (TVal | Null)*): Self = this.set("p", js.Array(value :_*))
    @scala.inline
    def setP(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setPNull: Self = this.set("p", null)
    @scala.inline
    def setPaddingVarargs(value: (TVal | Null)*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingNull: Self = this.set("padding", null)
    @scala.inline
    def setPaddingBottomVarargs(value: (TVal | Null)*): Self = this.set("paddingBottom", js.Array(value :_*))
    @scala.inline
    def setPaddingBottom(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingBottomNull: Self = this.set("paddingBottom", null)
    @scala.inline
    def setPaddingLeftVarargs(value: (TVal | Null)*): Self = this.set("paddingLeft", js.Array(value :_*))
    @scala.inline
    def setPaddingLeft(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingLeftNull: Self = this.set("paddingLeft", null)
    @scala.inline
    def setPaddingRightVarargs(value: (TVal | Null)*): Self = this.set("paddingRight", js.Array(value :_*))
    @scala.inline
    def setPaddingRight(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingRightNull: Self = this.set("paddingRight", null)
    @scala.inline
    def setPaddingTopVarargs(value: (TVal | Null)*): Self = this.set("paddingTop", js.Array(value :_*))
    @scala.inline
    def setPaddingTop(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPaddingTopNull: Self = this.set("paddingTop", null)
    @scala.inline
    def setPaddingXVarargs(value: (TVal | Null)*): Self = this.set("paddingX", js.Array(value :_*))
    @scala.inline
    def setPaddingX(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    @scala.inline
    def setPaddingXNull: Self = this.set("paddingX", null)
    @scala.inline
    def setPaddingYVarargs(value: (TVal | Null)*): Self = this.set("paddingY", js.Array(value :_*))
    @scala.inline
    def setPaddingY(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    @scala.inline
    def setPaddingYNull: Self = this.set("paddingY", null)
    @scala.inline
    def setPbVarargs(value: (TVal | Null)*): Self = this.set("pb", js.Array(value :_*))
    @scala.inline
    def setPb(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("pb", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePb: Self = this.set("pb", js.undefined)
    @scala.inline
    def setPbNull: Self = this.set("pb", null)
    @scala.inline
    def setPlVarargs(value: (TVal | Null)*): Self = this.set("pl", js.Array(value :_*))
    @scala.inline
    def setPl(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("pl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePl: Self = this.set("pl", js.undefined)
    @scala.inline
    def setPlNull: Self = this.set("pl", null)
    @scala.inline
    def setPrVarargs(value: (TVal | Null)*): Self = this.set("pr", js.Array(value :_*))
    @scala.inline
    def setPr(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setPrNull: Self = this.set("pr", null)
    @scala.inline
    def setPtVarargs(value: (TVal | Null)*): Self = this.set("pt", js.Array(value :_*))
    @scala.inline
    def setPt(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
    @scala.inline
    def setPtNull: Self = this.set("pt", null)
    @scala.inline
    def setPxVarargs(value: (TVal | Null)*): Self = this.set("px", js.Array(value :_*))
    @scala.inline
    def setPx(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePx: Self = this.set("px", js.undefined)
    @scala.inline
    def setPxNull: Self = this.set("px", null)
    @scala.inline
    def setPyVarargs(value: (TVal | Null)*): Self = this.set("py", js.Array(value :_*))
    @scala.inline
    def setPy(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("py", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePy: Self = this.set("py", js.undefined)
    @scala.inline
    def setPyNull: Self = this.set("py", null)
  }
  
}

