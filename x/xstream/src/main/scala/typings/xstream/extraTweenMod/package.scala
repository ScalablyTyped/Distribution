package typings.xstream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extraTweenMod {
  type Ease = js.Function3[/* x */ Double, /* from */ Double, /* to */ Double, Double]
  type NumericFunction = js.Function1[/* input */ Double, Double]
}
