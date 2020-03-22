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
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    paddingRight: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pr: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): PaddingRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingRightProps[ThemeType]]
  }
}

