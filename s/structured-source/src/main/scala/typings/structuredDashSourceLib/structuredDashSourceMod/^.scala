package typings
package structuredDashSourceLib.structuredDashSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("structured-source", JSImport.Namespace)
@js.native
class ^ protected () extends StructuredSource {
  /**
    * @param source - source code text.
    */
  def this(source: java.lang.String) = this()
  /* CompleteClass */
  override def indexToPosition(index: scala.Double): SourcePosition = js.native
  /* CompleteClass */
  override def locationToRange(loc: SourceLocation): js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override def positionToIndex(pos: SourcePosition): scala.Double = js.native
  /* CompleteClass */
  override def rangeToLocation(range: js.Tuple2[scala.Double, scala.Double]): SourceLocation = js.native
}

