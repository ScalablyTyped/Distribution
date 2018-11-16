package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface that should be implemented for all "range-compatible" objects. */

trait RangeLike extends js.Object {
  /** A Point representing the end of the Range. */
  var end: PointLike
  /** A Point representing the start of the Range. */
  var start: PointLike
}

