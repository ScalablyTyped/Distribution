package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object victoryMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Date
  import typings.std.Exclude
  import typings.std.Pick
  import typings.victory.Anon_XYNumber
  import typings.victory.Fn_DataAnyArray

  type AnimationData = AnimationStyle | js.Array[AnimationStyle]
  type AnimationStyle = StringDictionary[String | Double]
  /**
    * Category prop type
    */
  /* Rewritten from type alias, can be one of: 
    - js.Array[java.lang.String]
    - typings.victory.Anon_XArray
    - typings.victory.Anon_Y
    - typings.victory.Anon_XYArray
  */
  type CategoryPropType = _CategoryPropType | js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.victory.victoryStrings.greyscale
    - typings.victory.victoryStrings.qualitative
    - typings.victory.victoryStrings.heatmap
    - typings.victory.victoryStrings.warm
    - typings.victory.victoryStrings.cool
    - typings.victory.victoryStrings.red
    - typings.victory.victoryStrings.green
    - typings.victory.victoryStrings.blue
    - js.Array[java.lang.String]
  */
  type ColorScalePropType = _ColorScalePropType | js.Array[String]
  /**
    * Data getter property type
    */
  type DataGetterPropType = Double | String | js.Array[String] | Fn_DataAnyArray
  /**
    * Domain padding
    */
  type DomainPaddingPropType = Double | Anon_XYNumber
  /* Rewritten from type alias, can be one of: 
    - typings.victory.victoryMod.DomainTuple
    - typings.victory.Anon_XY
    - typings.victory.Anon_XYDomainTuple
  */
  type DomainPropType = _DomainPropType | DomainTuple
  /**
    * Data domain type
    */
  type DomainTuple = js.Tuple2[Date | Double, Date | Double]
  type NumberOrCallback = (js.Function2[/* datum */ js.Any, /* active */ Boolean, Double]) | Double
  /**
    * @see https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
    */
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type PaddingProps = Double | BlockProps
  // Many victory components accept string or number or callback which returns string or number
  type StringOrNumberOrCallback = String | Double | (js.Function2[/* datum */ js.Any, /* active */ Boolean, String | Double])
  type VictoryStyleObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: victory.victory.StringOrNumberOrCallback}
    */ typings.victory.victoryStrings.VictoryStyleObject with js.Any
}
