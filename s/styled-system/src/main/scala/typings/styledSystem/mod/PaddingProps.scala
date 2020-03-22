package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'p' | 'padding' | 'pt' | 'paddingTop' | 'pb' | 'paddingBottom' | 'pl' | 'paddingLeft' | 'pr' | 'paddingRight' | 'py' | 'px'> */
trait PaddingProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var p: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var padding: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var paddingBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var paddingLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var paddingRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var paddingTop: js.UndefOr[
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
  var pl: js.UndefOr[
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
  var pt: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var px: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
  var py: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.undefined
}

object PaddingProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    p: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    padding: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    paddingBottom: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    paddingLeft: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    paddingRight: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    paddingTop: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pb: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pl: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pr: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    pt: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    px: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null,
    py: ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ] = null
  ): PaddingProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingProps[ThemeType]]
  }
}

