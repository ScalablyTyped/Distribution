package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitVector extends js.Object {
  def release(): Unit
  def setValueAt(index: Double, value: Boolean): Unit
  def valueAt(index: Double): Boolean
}

object IBitVector {
  @scala.inline
  def apply(release: () => Unit, setValueAt: (Double, Boolean) => Unit, valueAt: Double => Boolean): IBitVector = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction2(setValueAt), valueAt = js.Any.fromFunction1(valueAt))
  
    __obj.asInstanceOf[IBitVector]
  }
}

