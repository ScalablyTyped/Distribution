package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationData = typings.victory.mod.AnimationStyle | js.Array[typings.victory.mod.AnimationStyle]
  type AnimationStyle = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  /**
    * Category prop type
    */
  /* Rewritten from type alias, can be one of: 
    - js.Array[java.lang.String]
    - typings.victory.AnonXArray
    - typings.victory.AnonYArray
    - typings.victory.AnonXArrayYArray
  */
  type CategoryPropType = typings.victory.mod._CategoryPropType | js.Array[java.lang.String]
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
  type ColorScalePropType = typings.victory.mod._ColorScalePropType | js.Array[java.lang.String]
  /**
    * Data getter property type
    */
  type DataGetterPropType = scala.Double | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* data */ js.Any, scala.Double | java.lang.String | js.Array[java.lang.String]])
  /**
    * Domain padding
    */
  type DomainPaddingPropType = scala.Double | typings.victory.Anon0
  /* Rewritten from type alias, can be one of: 
    - typings.victory.mod.DomainTuple
    - typings.victory.AnonXDomainTuple
    - typings.victory.AnonYDomainTuple
  */
  type DomainPropType = typings.victory.mod._DomainPropType | typings.victory.mod.DomainTuple
  /**
    * Data domain type
    */
  type DomainTuple = js.Tuple2[typings.std.Date | scala.Double, typings.std.Date | scala.Double]
  type NumberOrCallback = scala.Double | typings.victory.mod.VictoryNumberCallback
  /**
    * @see https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
    */
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type PaddingProps = scala.Double | typings.victory.mod.BlockProps
  type SliceNumberOrCallback[T, P] = scala.Double | (js.Function1[/* props */ typings.victory.mod.Omit[T, P], scala.Double])
  type StringOrNumberOrCallback = java.lang.String | scala.Double | typings.victory.mod.VictoryStringOrNumberCallback
  type VictoryNumberCallback = js.Function1[/* args */ typings.victory.mod.CallbackArgs, scala.Double]
  type VictoryStringOrNumberCallback = js.Function1[/* args */ typings.victory.mod.CallbackArgs, java.lang.String | scala.Double]
}
