package typings.typesettable

import typings.typesettable.writerMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy extends js.Object {
  def destroy(): Unit
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: () => Unit, write: (String, Double, IXAlign, Double, Double) => Unit): AnonDestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), write = js.Any.fromFunction5(write))
    __obj.asInstanceOf[AnonDestroy]
  }
}

