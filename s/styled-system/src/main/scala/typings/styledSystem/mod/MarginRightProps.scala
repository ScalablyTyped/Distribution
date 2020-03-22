package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mr' | 'marginRight'> */
trait MarginRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var marginRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var mr: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object MarginRightProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    marginRight: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    mr: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): MarginRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginRightProps[ThemeType]]
  }
}

