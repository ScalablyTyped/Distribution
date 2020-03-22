package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pt' | 'paddingTop'> */
trait PaddingTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingTop: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var pt: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object PaddingTopProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    paddingTop: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pt: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): PaddingTopProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingTopProps[ThemeType]]
  }
}

