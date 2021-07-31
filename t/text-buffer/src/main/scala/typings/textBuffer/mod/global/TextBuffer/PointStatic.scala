package typings.textBuffer.mod.global.TextBuffer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The static side to the Point class. */
@js.native
trait PointStatic
  extends StObject
     with /** Construct a Point object */
Instantiable0[Point]
     with Instantiable1[/* row */ Double, Point]
     with Instantiable2[(/* row */ Double) | (/* row */ Unit), /* column */ Double, Point] {
  
  /**
    *  Create a Point from an array containing two numbers representing the
    *  row and column.
    */
  def fromObject(`object`: PointCompatible): Point = js.native
  def fromObject(`object`: PointCompatible, copy: Boolean): Point = js.native
  
  /** Returns the given Point that is earlier in the buffer. */
  def min(point1: PointCompatible, point2: PointCompatible): Point = js.native
}
