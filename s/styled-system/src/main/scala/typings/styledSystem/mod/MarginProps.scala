package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'm' | 'margin' | 'mt' | 'marginTop' | 'mb' | 'marginBottom' | 'ml' | 'marginLeft' | 'mr' | 'marginRight' | 'my' | 'marginY' | 'mx' | 'marginX'> */
@js.native
trait MarginProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var m: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var margin: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var marginBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var marginLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var marginRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var marginTop: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var marginX: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var marginY: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var mb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var ml: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var mr: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var mt: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var mx: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var my: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}

object MarginProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): MarginProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginProps[ThemeType]]
  }
  @scala.inline
  implicit class MarginPropsOps[Self <: MarginProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with MarginProps[ThemeType]) extends AnyVal {
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
    def setMVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("m", js.Array(value :_*))
    @scala.inline
    def setM(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMNull: Self = this.set("m", null)
    @scala.inline
    def setMarginVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginNull: Self = this.set("margin", null)
    @scala.inline
    def setMarginBottomVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("marginBottom", js.Array(value :_*))
    @scala.inline
    def setMarginBottom(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginBottomNull: Self = this.set("marginBottom", null)
    @scala.inline
    def setMarginLeftVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("marginLeft", js.Array(value :_*))
    @scala.inline
    def setMarginLeft(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginLeftNull: Self = this.set("marginLeft", null)
    @scala.inline
    def setMarginRightVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("marginRight", js.Array(value :_*))
    @scala.inline
    def setMarginRight(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginRightNull: Self = this.set("marginRight", null)
    @scala.inline
    def setMarginTopVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("marginTop", js.Array(value :_*))
    @scala.inline
    def setMarginTop(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMarginTopNull: Self = this.set("marginTop", null)
    @scala.inline
    def setMarginXVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("marginX", js.Array(value :_*))
    @scala.inline
    def setMarginX(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginX: Self = this.set("marginX", js.undefined)
    @scala.inline
    def setMarginXNull: Self = this.set("marginX", null)
    @scala.inline
    def setMarginYVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("marginY", js.Array(value :_*))
    @scala.inline
    def setMarginY(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginY: Self = this.set("marginY", js.undefined)
    @scala.inline
    def setMarginYNull: Self = this.set("marginY", null)
    @scala.inline
    def setMbVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("mb", js.Array(value :_*))
    @scala.inline
    def setMb(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setMbNull: Self = this.set("mb", null)
    @scala.inline
    def setMlVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("ml", js.Array(value :_*))
    @scala.inline
    def setMl(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("ml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
    @scala.inline
    def setMlNull: Self = this.set("ml", null)
    @scala.inline
    def setMrVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("mr", js.Array(value :_*))
    @scala.inline
    def setMr(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMr: Self = this.set("mr", js.undefined)
    @scala.inline
    def setMrNull: Self = this.set("mr", null)
    @scala.inline
    def setMtVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("mt", js.Array(value :_*))
    @scala.inline
    def setMt(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setMtNull: Self = this.set("mt", null)
    @scala.inline
    def setMxVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("mx", js.Array(value :_*))
    @scala.inline
    def setMx(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("mx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMx: Self = this.set("mx", js.undefined)
    @scala.inline
    def setMxNull: Self = this.set("mx", null)
    @scala.inline
    def setMyVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("my", js.Array(value :_*))
    @scala.inline
    def setMy(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    @scala.inline
    def setMyNull: Self = this.set("my", null)
  }
  
}

