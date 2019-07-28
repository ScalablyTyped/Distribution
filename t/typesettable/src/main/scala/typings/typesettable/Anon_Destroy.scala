package typings.typesettable

import typings.typesettable.buildSrcWritersWriterMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy extends js.Object {
  def destroy(): Unit
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
}

object Anon_Destroy {
  @scala.inline
  def apply(destroy: () => Unit, write: (String, Double, IXAlign, Double, Double) => Unit): Anon_Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), write = js.Any.fromFunction5(write))
  
    __obj.asInstanceOf[Anon_Destroy]
  }
}

