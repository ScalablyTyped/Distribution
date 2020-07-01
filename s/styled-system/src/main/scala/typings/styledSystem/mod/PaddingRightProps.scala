package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pr' | 'paddingRight'> */
trait PaddingRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var pr: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object PaddingRightProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](
    paddingRight: js.UndefOr[
      Null | (ResponsiveValue[
        ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
        ThemeType
      ])
    ] = js.undefined,
    pr: js.UndefOr[
      Null | (ResponsiveValue[
        ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
        ThemeType
      ])
    ] = js.undefined
  ): PaddingRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (!js.isUndefined(pr)) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingRightProps[ThemeType]]
  }
}

