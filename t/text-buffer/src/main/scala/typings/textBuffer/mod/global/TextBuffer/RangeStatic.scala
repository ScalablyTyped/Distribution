package typings.textBuffer.mod.global.TextBuffer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The static side to the Range class. */
@js.native
trait RangeStatic
  extends /** Construct a Range object. */
Instantiable0[Range]
     with Instantiable1[/* pointA */ PointCompatible, Range]
     with Instantiable2[js.UndefOr[/* pointA */ PointCompatible], /* pointB */ PointCompatible, Range] {
  
  /** Call this with the result of Range::serialize to construct a new Range. */
  def deserialize(array: js.Object): Range = js.native
  
  /** Convert any range-compatible object to a Range. */
  def fromObject(`object`: RangeCompatible): Range = js.native
  def fromObject(`object`: RangeCompatible, copy: Boolean): Range = js.native
}
