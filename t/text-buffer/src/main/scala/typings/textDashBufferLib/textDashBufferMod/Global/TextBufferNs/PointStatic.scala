package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The static side to the Point class. */
@js.native
trait PointStatic
  extends /** Construct a Point object */
org.scalablytyped.runtime.Instantiable0[Point]
     with org.scalablytyped.runtime.Instantiable1[/* row */ scala.Double, Point]
     with org.scalablytyped.runtime.Instantiable2[/* row */ scala.Double, /* column */ scala.Double, Point] {
  /**
    *  Create a Point from an array containing two numbers representing the
    *  row and column.
    */
  def fromObject(`object`: PointCompatible): Point = js.native
  def fromObject(`object`: PointCompatible, copy: scala.Boolean): Point = js.native
  /** Returns the given Point that is earlier in the buffer. */
  def min(point1: PointCompatible, point2: PointCompatible): Point = js.native
}

