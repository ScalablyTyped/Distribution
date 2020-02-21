package typings.styledSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Config = /** Property name exposed for use in components */
  org.scalablytyped.runtime.StringDictionary[typings.styledSystem.mod.ConfigStyle | scala.Boolean]
  type MarginBottomProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.mb | typings.styledSystem.styledSystemStrings.marginBottom
  ]
  type MarginLeftProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.ml | typings.styledSystem.styledSystemStrings.marginLeft
  ]
  type MarginProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.m | typings.styledSystem.styledSystemStrings.margin | typings.styledSystem.styledSystemStrings.mt | typings.styledSystem.styledSystemStrings.marginTop | typings.styledSystem.styledSystemStrings.mb | typings.styledSystem.styledSystemStrings.marginBottom | typings.styledSystem.styledSystemStrings.ml | typings.styledSystem.styledSystemStrings.marginLeft | typings.styledSystem.styledSystemStrings.mr | typings.styledSystem.styledSystemStrings.marginRight | typings.styledSystem.styledSystemStrings.my | typings.styledSystem.styledSystemStrings.mx
  ]
  type MarginRightProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.mr | typings.styledSystem.styledSystemStrings.marginRight
  ]
  type MarginTopProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.mt | typings.styledSystem.styledSystemStrings.marginTop
  ]
  type ObjectOrArray[T, K /* <: java.lang.String */] = js.Array[T] | (typings.std.Record[K, T | (typings.std.Record[K, T]) | js.Array[T]])
  type PaddingBottomProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.pb | typings.styledSystem.styledSystemStrings.paddingBottom
  ]
  type PaddingLeftProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.pl | typings.styledSystem.styledSystemStrings.paddingLeft
  ]
  type PaddingProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.p | typings.styledSystem.styledSystemStrings.padding | typings.styledSystem.styledSystemStrings.pt | typings.styledSystem.styledSystemStrings.paddingTop | typings.styledSystem.styledSystemStrings.pb | typings.styledSystem.styledSystemStrings.paddingBottom | typings.styledSystem.styledSystemStrings.pl | typings.styledSystem.styledSystemStrings.paddingLeft | typings.styledSystem.styledSystemStrings.pr | typings.styledSystem.styledSystemStrings.paddingRight | typings.styledSystem.styledSystemStrings.py | typings.styledSystem.styledSystemStrings.px
  ]
  type PaddingRightProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.pr | typings.styledSystem.styledSystemStrings.paddingRight
  ]
  type PaddingTopProps[ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[
      ThemeType, 
      typings.styledSystem.mod.ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]
    ], 
    typings.styledSystem.styledSystemStrings.pt | typings.styledSystem.styledSystemStrings.paddingTop
  ]
  type RequiredTheme = typings.std.Required[typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem]]
  type ResponsiveValue[T, ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = T | (js.Array[T | scala.Null]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in styled-system.styled-system.ThemeValue<'breakpoints', ThemeType, any> & string | number ]:? T}
    */ typings.styledSystem.styledSystemStrings.ResponsiveValue with js.Any)
  type Scale = typings.styledSystem.mod.ObjectOrArray[scala.Double | java.lang.String, java.lang.String]
  type TLengthStyledSystem = java.lang.String | typings.styledSystem.styledSystemNumbers.`0` | scala.Double
  type ThemeValue[K /* <: java.lang.String */, ThemeType, TVal] = js.Any | scala.Double
}
