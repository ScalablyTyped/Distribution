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
  def apply[ThemeType](
    paddingLeft: js.UndefOr[
      Null | (ResponsiveValue[
        ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
        ThemeType
      ])
    ] = js.undefined,
    pl: js.UndefOr[
      Null | (ResponsiveValue[
        ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
        ThemeType
      ])
    ] = js.undefined
  ): PaddingLeftProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(pl)) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeftProps[ThemeType]]
  }
}

