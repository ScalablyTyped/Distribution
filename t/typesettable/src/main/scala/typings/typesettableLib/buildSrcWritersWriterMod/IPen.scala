package typings
package typesettableLib.buildSrcWritersWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPen extends js.Object {
  /**
    * Called once all the lines have been written
    */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called once for each line of text in the block.
    *
    * `xOffset` and `yOffset` are assumed to be in an independent text-aligned
    * coordinate space.
    */
  def write(
    line: java.lang.String,
    width: scala.Double,
    anchor: IXAlign,
    xOffset: scala.Double,
    yOffset: scala.Double
  ): scala.Unit
}

