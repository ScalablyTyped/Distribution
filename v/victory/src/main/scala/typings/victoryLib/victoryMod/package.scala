package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object victoryMod {
  type AnimationData = AnimationStyle | js.Array[AnimationStyle]
  type AnimationStyle = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  /**
    * Category prop type
    */
  /* Rewritten from type alias, can be one of: 
    - js.Array[java.lang.String]
    - victoryLib.Anon_XArray
    - victoryLib.Anon_Y
    - victoryLib.Anon_XYArray
  */
  type CategoryPropType = _CategoryPropType | js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - victoryLib.victoryLibStrings.greyscale
    - victoryLib.victoryLibStrings.qualitative
    - victoryLib.victoryLibStrings.heatmap
    - victoryLib.victoryLibStrings.warm
    - victoryLib.victoryLibStrings.cool
    - victoryLib.victoryLibStrings.red
    - victoryLib.victoryLibStrings.green
    - victoryLib.victoryLibStrings.blue
    - js.Array[java.lang.String]
  */
  type ColorScalePropType = _ColorScalePropType | js.Array[java.lang.String]
  /**
    * Data getter property type
    */
  type DataGetterPropType = scala.Double | java.lang.String | js.Array[java.lang.String] | victoryLib.Anon_DataAnyArray
  /**
    * Domain padding
    */
  type DomainPaddingPropType = scala.Double | victoryLib.Anon_XYNumber
  /* Rewritten from type alias, can be one of: 
    - DomainTuple
    - victoryLib.Anon_XY
    - victoryLib.Anon_XYDomainTuple
  */
  type DomainPropType = _DomainPropType | DomainTuple
  /**
    * Data domain type
    */
  type DomainTuple = (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple2[stdLib.Date, stdLib.Date])
  type NumberOrCallback = (js.Function2[/* datum */ js.Any, /* active */ scala.Boolean, scala.Double]) | scala.Double
  /**
    * @see https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
    */
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type PaddingProps = scala.Double | BlockProps
  // Many victory components accept string or number or callback which returns string or number
  type StringOrNumberOrCallback = java.lang.String | scala.Double | (js.Function2[/* datum */ js.Any, /* active */ scala.Boolean, java.lang.String | scala.Double])
  type VictoryStyleObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: victory.victory.StringOrNumberOrCallback}
    */ victoryLib.victoryLibStrings.VictoryStyleObject with js.Any
}
