package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pb' | 'paddingBottom'> */
@js.native
trait PaddingBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var pb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}

object PaddingBottomProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): PaddingBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[ThemeType]]
  }
  @scala.inline
  implicit class PaddingBottomPropsOps[Self <: PaddingBottomProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with PaddingBottomProps[ThemeType]) extends AnyVal {
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
    def setPaddingBottomVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("paddingBottom", js.Array(value :_*))
    @scala.inline
    def setPaddingBottom(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingBottomNull: Self = this.set("paddingBottom", null)
    @scala.inline
    def setPbVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("pb", js.Array(value :_*))
    @scala.inline
    def setPb(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("pb", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePb: Self = this.set("pb", js.undefined)
    @scala.inline
    def setPbNull: Self = this.set("pb", null)
  }
  
}

