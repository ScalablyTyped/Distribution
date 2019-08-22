package typings.atTypescriptDashEslintTypescriptDashEstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTsDashEstreeTsDashEstreeMod {
  import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Loc
  import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.loc
  import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.range
  import typings.std.Exclude
  import typings.std.Pick

  type OptionalRangeAndLoc[T] = (Pick[T, Exclude[String, range | loc]]) with Anon_Loc
  type Range = js.Tuple2[Double, Double]
}
