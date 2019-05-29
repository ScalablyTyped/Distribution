package typings
package textDashBufferLib.textDashBufferMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextBufferNs {
  /** The types usable when constructing a point via the Point::fromObject method. */
  type PointCompatible = PointLike | (js.Tuple2[scala.Double, scala.Double])
  /** The types usable when constructing a range via the Range::fromObject method. */
  type RangeCompatible = RangeLike | (js.Tuple2[
    PointLike | (js.Tuple2[scala.Double, scala.Double]), 
    PointLike | (js.Tuple2[scala.Double, scala.Double])
  ])
}
