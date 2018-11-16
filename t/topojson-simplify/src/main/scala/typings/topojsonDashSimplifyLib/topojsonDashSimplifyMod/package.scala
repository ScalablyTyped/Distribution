package typings
package topojsonDashSimplifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topojsonDashSimplifyMod {
  type Filter = js.Function2[/* ring */ Ring, /* interior */ scala.Boolean, scala.Boolean]
  type Ring = js.Array[js.Tuple2[scala.Double, scala.Double]]
  type RingWeighter = js.Function1[/* triangle */ Ring, scala.Double]
  type Triangle = js.Tuple3[
    js.Tuple2[scala.Double, scala.Double], 
    js.Tuple2[scala.Double, scala.Double], 
    js.Tuple2[scala.Double, scala.Double]
  ]
  type TriangleWeighter = js.Function1[/* triangle */ Triangle, scala.Double]
}
