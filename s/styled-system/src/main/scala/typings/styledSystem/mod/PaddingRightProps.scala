package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pr' | 'paddingRight'> */
@js.native
trait PaddingRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var pr: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}

object PaddingRightProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): PaddingRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingRightProps[ThemeType]]
  }
  @scala.inline
  implicit class PaddingRightPropsOps[Self <: PaddingRightProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with PaddingRightProps[ThemeType]) extends AnyVal {
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
    def setPaddingRightVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("paddingRight", js.Array(value :_*))
    @scala.inline
    def setPaddingRight(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingRightNull: Self = this.set("paddingRight", null)
    @scala.inline
    def setPrVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = this.set("pr", js.Array(value :_*))
    @scala.inline
    def setPr(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setPrNull: Self = this.set("pr", null)
  }
  
}

