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

object IPen {
  @scala.inline
  def apply(
    write: js.Function5[java.lang.String, scala.Double, IXAlign, scala.Double, scala.Double, scala.Unit],
    destroy: js.Function0[scala.Unit] = null
  ): IPen = {
    val __obj = js.Dynamic.literal(write = write)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    __obj.asInstanceOf[IPen]
  }
}

