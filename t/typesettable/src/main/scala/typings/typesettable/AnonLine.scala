package typings.typesettable

import typings.typesettable.writerMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
}

object AnonLine {
  @scala.inline
  def apply(write: (String, Double, IXAlign, Double, Double) => Unit): AnonLine = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction5(write))
  
    __obj.asInstanceOf[AnonLine]
  }
}

