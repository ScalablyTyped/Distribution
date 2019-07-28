package typings.styledDashSystem

import org.scalablytyped.runtime.StringDictionary
import typings.std.Pick
import typings.styledDashSystem.styledDashSystemNumbers.`0`
import typings.styledDashSystem.styledDashSystemStrings.m
import typings.styledDashSystem.styledDashSystemStrings.margin
import typings.styledDashSystem.styledDashSystemStrings.marginBottom
import typings.styledDashSystem.styledDashSystemStrings.marginLeft
import typings.styledDashSystem.styledDashSystemStrings.marginRight
import typings.styledDashSystem.styledDashSystemStrings.marginTop
import typings.styledDashSystem.styledDashSystemStrings.mb
import typings.styledDashSystem.styledDashSystemStrings.ml
import typings.styledDashSystem.styledDashSystemStrings.mr
import typings.styledDashSystem.styledDashSystemStrings.mt
import typings.styledDashSystem.styledDashSystemStrings.mx
import typings.styledDashSystem.styledDashSystemStrings.my
import typings.styledDashSystem.styledDashSystemStrings.p
import typings.styledDashSystem.styledDashSystemStrings.padding
import typings.styledDashSystem.styledDashSystemStrings.paddingBottom
import typings.styledDashSystem.styledDashSystemStrings.paddingLeft
import typings.styledDashSystem.styledDashSystemStrings.paddingRight
import typings.styledDashSystem.styledDashSystemStrings.paddingTop
import typings.styledDashSystem.styledDashSystemStrings.pb
import typings.styledDashSystem.styledDashSystemStrings.pl
import typings.styledDashSystem.styledDashSystemStrings.pr
import typings.styledDashSystem.styledDashSystemStrings.pt
import typings.styledDashSystem.styledDashSystemStrings.px
import typings.styledDashSystem.styledDashSystemStrings.py
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashSystemMod {
  type Config = /** Property name exposed for use in components */
  StringDictionary[ConfigStyle | Boolean]
  type MarginBottomProps = Pick[SpaceProps[TLengthStyledSystem], mb | marginBottom]
  type MarginLeftProps = Pick[SpaceProps[TLengthStyledSystem], ml | marginLeft]
  type MarginProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    m | margin | mt | marginTop | mb | marginBottom | ml | marginLeft | mr | marginRight | my | mx
  ]
  type MarginRightProps = Pick[SpaceProps[TLengthStyledSystem], mr | marginRight]
  type MarginTopProps = Pick[SpaceProps[TLengthStyledSystem], mt | marginTop]
  type ObjectOrArray[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias styled-system.styled-system.ObjectOrArray<T> */ js.Object)
  ])
  type PaddingBottomProps = Pick[SpaceProps[TLengthStyledSystem], pb | paddingBottom]
  type PaddingLeftProps = Pick[SpaceProps[TLengthStyledSystem], pl | paddingLeft]
  type PaddingProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    p | padding | pt | paddingTop | pb | paddingBottom | pl | paddingLeft | pr | paddingRight | py | px
  ]
  type PaddingRightProps = Pick[SpaceProps[TLengthStyledSystem], pr | paddingRight]
  type PaddingTopProps = Pick[SpaceProps[TLengthStyledSystem], pt | paddingTop]
  type ResponsiveValue[T] = T | (js.Array[T | Null]) | StringDictionary[T]
  type Scale = ObjectOrArray[Double | String]
  type TLengthStyledSystem = String | `0` | Double
}
