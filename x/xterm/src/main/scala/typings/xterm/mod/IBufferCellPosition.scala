package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A position within a buffer.
  */
trait IBufferCellPosition extends js.Object {
  /**
    * The x position within the buffer.
    */
  var x: Double
  /**
    * The y position within the buffer.
    */
  var y: Double
}

object IBufferCellPosition {
  @scala.inline
  def apply(x: Double, y: Double): IBufferCellPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferCellPosition]
  }
}

