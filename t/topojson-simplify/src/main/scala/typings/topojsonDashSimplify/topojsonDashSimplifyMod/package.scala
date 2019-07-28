package typings.topojsonDashSimplify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topojsonDashSimplifyMod {
  type Filter = js.Function2[/* ring */ Ring, /* interior */ Boolean, Boolean]
  type Ring = js.Array[js.Tuple2[Double, Double]]
  type RingWeighter = js.Function1[/* triangle */ Ring, Double]
  type Triangle = js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  type TriangleWeighter = js.Function1[/* triangle */ Triangle, Double]
}
