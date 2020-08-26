package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mb' | 'marginBottom'> */
@js.native
trait MarginBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var marginBottom: js.UndefOr[
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
}

object MarginBottomProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): MarginBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[ThemeType]]
  }
  @scala.inline
  implicit class MarginBottomPropsOps[Self <: MarginBottomProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with MarginBottomProps[ThemeType]) extends AnyVal {
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
  }
  
}

