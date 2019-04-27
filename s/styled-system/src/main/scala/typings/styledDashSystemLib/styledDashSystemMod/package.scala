package typings
package styledDashSystemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashSystemMod {
  type MarginBottomProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.mb | styledDashSystemLib.styledDashSystemLibStrings.marginBottom
  ]
  type MarginLeftProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.ml | styledDashSystemLib.styledDashSystemLibStrings.marginLeft
  ]
  type MarginProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.m | styledDashSystemLib.styledDashSystemLibStrings.margin | styledDashSystemLib.styledDashSystemLibStrings.mt | styledDashSystemLib.styledDashSystemLibStrings.marginTop | styledDashSystemLib.styledDashSystemLibStrings.mb | styledDashSystemLib.styledDashSystemLibStrings.marginBottom | styledDashSystemLib.styledDashSystemLibStrings.ml | styledDashSystemLib.styledDashSystemLibStrings.marginLeft | styledDashSystemLib.styledDashSystemLibStrings.mr | styledDashSystemLib.styledDashSystemLibStrings.marginRight
  ]
  type MarginRightProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.mr | styledDashSystemLib.styledDashSystemLibStrings.marginRight
  ]
  type MarginTopProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.mt | styledDashSystemLib.styledDashSystemLibStrings.marginTop
  ]
  type ObjectOrArray[T] = js.Array[T] | org.scalablytyped.runtime.StringDictionary[T]
  type PaddingBottomProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.pb | styledDashSystemLib.styledDashSystemLibStrings.paddingBottom
  ]
  type PaddingLeftProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.pl | styledDashSystemLib.styledDashSystemLibStrings.paddingLeft
  ]
  type PaddingProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.p | styledDashSystemLib.styledDashSystemLibStrings.padding | styledDashSystemLib.styledDashSystemLibStrings.pt | styledDashSystemLib.styledDashSystemLibStrings.paddingTop | styledDashSystemLib.styledDashSystemLibStrings.pb | styledDashSystemLib.styledDashSystemLibStrings.paddingBottom | styledDashSystemLib.styledDashSystemLibStrings.pl | styledDashSystemLib.styledDashSystemLibStrings.paddingLeft | styledDashSystemLib.styledDashSystemLibStrings.pr | styledDashSystemLib.styledDashSystemLibStrings.paddingRight
  ]
  type PaddingRightProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.pr | styledDashSystemLib.styledDashSystemLibStrings.paddingRight
  ]
  type PaddingTopProps = stdLib.Pick[
    SpaceProps[TLengthStyledSystem], 
    styledDashSystemLib.styledDashSystemLibStrings.pt | styledDashSystemLib.styledDashSystemLibStrings.paddingTop
  ]
  type ResponsiveValue[T] = T | (js.Array[T | scala.Null]) | org.scalablytyped.runtime.StringDictionary[T]
  type TLengthStyledSystem = java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0` | scala.Double
}
