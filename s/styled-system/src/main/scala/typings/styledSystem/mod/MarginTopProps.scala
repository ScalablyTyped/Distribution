package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mt' | 'marginTop'> */
trait MarginTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var marginTop: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var mt: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object MarginTopProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    marginTop: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    mt: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): MarginTopProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopProps[ThemeType]]
  }
}

