package typings
package topojsonDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topojsonDashClientMod {
  type Transformer = js.Function2[
    /* point */ js.Array[scala.Double], 
    /* index */ js.UndefOr[scala.Boolean], 
    js.Array[scala.Double]
  ]
}
