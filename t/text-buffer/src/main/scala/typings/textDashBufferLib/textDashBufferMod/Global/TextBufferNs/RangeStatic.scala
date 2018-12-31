package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The static side to the Range class. */
@js.native
trait RangeStatic
  extends /** Construct a Range object. */
org.scalablytyped.runtime.Instantiable0[Range]
     with org.scalablytyped.runtime.Instantiable1[/* pointA */ PointCompatible, Range]
     with org.scalablytyped.runtime.Instantiable2[/* pointA */ PointCompatible, /* pointB */ PointCompatible, Range] {
  /** Call this with the result of Range::serialize to construct a new Range. */
  def deserialize(array: js.Object): Range = js.native
  /** Convert any range-compatible object to a Range. */
  def fromObject(`object`: RangeCompatible): Range = js.native
  def fromObject(`object`: RangeCompatible, copy: scala.Boolean): Range = js.native
}

