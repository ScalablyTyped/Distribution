package typings.typesettable.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPen extends js.Object {
  /**
    * Called once all the lines have been written
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called once for each line of text in the block.
    *
    * `xOffset` and `yOffset` are assumed to be in an independent text-aligned
    * coordinate space.
    */
  def write(line: String, width: Double, anchor: IXAlign, xOffset: Double, yOffset: Double): Unit
}

object IPen {
  @scala.inline
  def apply(write: (String, Double, IXAlign, Double, Double) => Unit, destroy: () => Unit = null): IPen = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction5(write))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IPen]
  }
}

