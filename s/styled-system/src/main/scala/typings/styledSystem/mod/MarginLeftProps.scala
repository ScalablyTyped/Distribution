package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'ml' | 'marginLeft'> */
trait MarginLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var marginLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var ml: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object MarginLeftProps {
  @scala.inline
  def apply[ThemeType](
    marginLeft: js.UndefOr[
      Null | (ResponsiveValue[
        ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
        ThemeType
      ])
    ] = js.undefined,
    ml: js.UndefOr[
      Null | (ResponsiveValue[
        ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
        ThemeType
      ])
    ] = js.undefined
  ): MarginLeftProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(ml)) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeftProps[ThemeType]]
  }
}

