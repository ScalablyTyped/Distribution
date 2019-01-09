package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object victoryMod {
  type AnimationData = AnimationStyle | js.Array[AnimationStyle]
  type AnimationEasing = victoryLib.victoryLibStrings.back | victoryLib.victoryLibStrings.backIn | victoryLib.victoryLibStrings.backOut | victoryLib.victoryLibStrings.backInOut | victoryLib.victoryLibStrings.bounce | victoryLib.victoryLibStrings.bounceIn | victoryLib.victoryLibStrings.bounceOut | victoryLib.victoryLibStrings.bounceInOut | victoryLib.victoryLibStrings.circle | victoryLib.victoryLibStrings.circleIn | victoryLib.victoryLibStrings.circleOut | victoryLib.victoryLibStrings.circleInOut | victoryLib.victoryLibStrings.linear | victoryLib.victoryLibStrings.linearIn | victoryLib.victoryLibStrings.linearOut | victoryLib.victoryLibStrings.linearInOut | victoryLib.victoryLibStrings.cubic | victoryLib.victoryLibStrings.cubicIn | victoryLib.victoryLibStrings.cubicOut | victoryLib.victoryLibStrings.cubicInOut | victoryLib.victoryLibStrings.elastic | victoryLib.victoryLibStrings.elasticIn | victoryLib.victoryLibStrings.elasticOut | victoryLib.victoryLibStrings.elasticInOut | victoryLib.victoryLibStrings.exp | victoryLib.victoryLibStrings.expIn | victoryLib.victoryLibStrings.expOut | victoryLib.victoryLibStrings.expInOut | victoryLib.victoryLibStrings.poly | victoryLib.victoryLibStrings.polyIn | victoryLib.victoryLibStrings.polyOut | victoryLib.victoryLibStrings.polyInOut | victoryLib.victoryLibStrings.quad | victoryLib.victoryLibStrings.quadIn | victoryLib.victoryLibStrings.quadOut | victoryLib.victoryLibStrings.quadInOut | victoryLib.victoryLibStrings.sin | victoryLib.victoryLibStrings.sinIn | victoryLib.victoryLibStrings.sinOut | victoryLib.victoryLibStrings.sinInOut
  /**
    * Category prop type
    */
  type CategoryPropType = js.Array[java.lang.String] | victoryLib.Anon_XYArray
  type ColorScalePropType = victoryLib.victoryLibStrings.greyscale | victoryLib.victoryLibStrings.qualitative | victoryLib.victoryLibStrings.heatmap | victoryLib.victoryLibStrings.warm | victoryLib.victoryLibStrings.cool | victoryLib.victoryLibStrings.red | victoryLib.victoryLibStrings.green | victoryLib.victoryLibStrings.blue | js.Array[java.lang.String]
  /**
    * Data getter property type
    */
  type DataGetterPropType = scala.Double | java.lang.String | js.Array[java.lang.String] | victoryLib.Anon_DataAnyArray
  /**
    * Domain padding
    */
  type DomainPaddingPropType = scala.Double | victoryLib.Anon_XYNumber
  type DomainPropType = DomainTuple | victoryLib.Anon_X | victoryLib.Anon_XY
  /**
    * Data domain type
    */
  type DomainTuple = (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple2[stdLib.Date, stdLib.Date])
  type InterpolationPropType = victoryLib.victoryLibStrings.basis | victoryLib.victoryLibStrings.basisClosed | victoryLib.victoryLibStrings.basisOpen | victoryLib.victoryLibStrings.bundle | victoryLib.victoryLibStrings.cardinal | victoryLib.victoryLibStrings.cardinalClosed | victoryLib.victoryLibStrings.cardinalOpen | victoryLib.victoryLibStrings.catmullRom | victoryLib.victoryLibStrings.catmullRomClosed | victoryLib.victoryLibStrings.catmullRomOpen | victoryLib.victoryLibStrings.linear | victoryLib.victoryLibStrings.linearClosed | victoryLib.victoryLibStrings.monotoneX | victoryLib.victoryLibStrings.monotoneY | victoryLib.victoryLibStrings.natural | victoryLib.victoryLibStrings.radial | victoryLib.victoryLibStrings.step | victoryLib.victoryLibStrings.stepAfter | victoryLib.victoryLibStrings.stepBefore
  type NumberOrCallback = victoryLib.Anon_Number_1120640005 | scala.Double
  type OrientationTypes = victoryLib.victoryLibStrings.top | victoryLib.victoryLibStrings.bottom | victoryLib.victoryLibStrings.left | victoryLib.victoryLibStrings.right
  /**
    * Acceptable scale types
    */
  type ScalePropType = victoryLib.victoryLibStrings.linear | victoryLib.victoryLibStrings.time | victoryLib.victoryLibStrings.log | victoryLib.victoryLibStrings.sqrt
  type ScatterSymbolType = victoryLib.victoryLibStrings.circle | victoryLib.victoryLibStrings.diamond | victoryLib.victoryLibStrings.plus | victoryLib.victoryLibStrings.square | victoryLib.victoryLibStrings.star | victoryLib.victoryLibStrings.triangleDown | victoryLib.victoryLibStrings.triangleUp
  // Many victory components accept string or number or callback which returns string or number
  type StringOrNumberOrCallback = java.lang.String | scala.Double | victoryLib.Anon_Number
  /**
    * Text anchor type
    */
  type TextAnchorType = victoryLib.victoryLibStrings.start | victoryLib.victoryLibStrings.middle | victoryLib.victoryLibStrings.end | victoryLib.victoryLibStrings.inherit
  /**
    * Vertical anchor type
    */
  type VerticalAnchorType = victoryLib.victoryLibStrings.start | victoryLib.victoryLibStrings.middle | victoryLib.victoryLibStrings.end
}
