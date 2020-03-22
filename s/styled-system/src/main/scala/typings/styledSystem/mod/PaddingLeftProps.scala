package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pl' | 'paddingLeft'> */
trait PaddingLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var pl: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object PaddingLeftProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    paddingLeft: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pl: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): PaddingLeftProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeftProps[ThemeType]]
  }
}

