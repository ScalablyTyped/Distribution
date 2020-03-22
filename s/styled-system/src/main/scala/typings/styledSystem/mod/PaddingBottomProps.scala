package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pb' | 'paddingBottom'> */
trait PaddingBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var pb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object PaddingBottomProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    paddingBottom: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pb: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): PaddingBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottomProps[ThemeType]]
  }
}

