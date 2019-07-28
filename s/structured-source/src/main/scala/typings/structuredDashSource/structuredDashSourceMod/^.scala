package typings.structuredDashSource.structuredDashSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("structured-source", JSImport.Namespace)
@js.native
class ^ protected () extends StructuredSource {
  /**
    * @param source - source code text.
    */
  def this(source: String) = this()
  /* CompleteClass */
  override def indexToPosition(index: Double): SourcePosition = js.native
  /* CompleteClass */
  override def locationToRange(loc: SourceLocation): js.Tuple2[Double, Double] = js.native
  /* CompleteClass */
  override def positionToIndex(pos: SourcePosition): Double = js.native
  /* CompleteClass */
  override def rangeToLocation(range: js.Tuple2[Double, Double]): SourceLocation = js.native
}

