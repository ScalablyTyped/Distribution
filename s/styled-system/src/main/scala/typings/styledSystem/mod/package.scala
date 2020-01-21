package typings.styledSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Config = /** Property name exposed for use in components */
  org.scalablytyped.runtime.StringDictionary[typings.styledSystem.mod.ConfigStyle | scala.Boolean]
  type MarginBottomProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.mb | typings.styledSystem.styledSystemStrings.marginBottom
  ]
  type MarginLeftProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.ml | typings.styledSystem.styledSystemStrings.marginLeft
  ]
  type MarginProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.m | typings.styledSystem.styledSystemStrings.margin | typings.styledSystem.styledSystemStrings.mt | typings.styledSystem.styledSystemStrings.marginTop | typings.styledSystem.styledSystemStrings.mb | typings.styledSystem.styledSystemStrings.marginBottom | typings.styledSystem.styledSystemStrings.ml | typings.styledSystem.styledSystemStrings.marginLeft | typings.styledSystem.styledSystemStrings.mr | typings.styledSystem.styledSystemStrings.marginRight | typings.styledSystem.styledSystemStrings.my | typings.styledSystem.styledSystemStrings.mx
  ]
  type MarginRightProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.mr | typings.styledSystem.styledSystemStrings.marginRight
  ]
  type MarginTopProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.mt | typings.styledSystem.styledSystemStrings.marginTop
  ]
  type ObjectOrArray[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias styled-system.styled-system.ObjectOrArray<T> */ js.Object)
  ])
  type PaddingBottomProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.pb | typings.styledSystem.styledSystemStrings.paddingBottom
  ]
  type PaddingLeftProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.pl | typings.styledSystem.styledSystemStrings.paddingLeft
  ]
  type PaddingProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.p | typings.styledSystem.styledSystemStrings.padding | typings.styledSystem.styledSystemStrings.pt | typings.styledSystem.styledSystemStrings.paddingTop | typings.styledSystem.styledSystemStrings.pb | typings.styledSystem.styledSystemStrings.paddingBottom | typings.styledSystem.styledSystemStrings.pl | typings.styledSystem.styledSystemStrings.paddingLeft | typings.styledSystem.styledSystemStrings.pr | typings.styledSystem.styledSystemStrings.paddingRight | typings.styledSystem.styledSystemStrings.py | typings.styledSystem.styledSystemStrings.px
  ]
  type PaddingRightProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.pr | typings.styledSystem.styledSystemStrings.paddingRight
  ]
  type PaddingTopProps = typings.std.Pick[
    typings.styledSystem.mod.SpaceProps[typings.styledSystem.mod.TLengthStyledSystem], 
    typings.styledSystem.styledSystemStrings.pt | typings.styledSystem.styledSystemStrings.paddingTop
  ]
  type ResponsiveValue[T] = T | (js.Array[T | scala.Null]) | org.scalablytyped.runtime.StringDictionary[T]
  type Scale = typings.styledSystem.mod.ObjectOrArray[scala.Double | java.lang.String]
  type TLengthStyledSystem = java.lang.String | typings.styledSystem.styledSystemNumbers.`0` | scala.Double
}
