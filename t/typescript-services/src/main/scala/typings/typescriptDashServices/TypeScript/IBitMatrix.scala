package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitMatrix extends js.Object {
  def release(): Unit
  def setValueAt(x: Double, y: Double, value: Boolean): Unit
  def valueAt(x: Double, y: Double): Boolean
}

object IBitMatrix {
  @scala.inline
  def apply(
    release: () => Unit,
    setValueAt: (Double, Double, Boolean) => Unit,
    valueAt: (Double, Double) => Boolean
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction3(setValueAt), valueAt = js.Any.fromFunction2(valueAt))
  
    __obj.asInstanceOf[IBitMatrix]
  }
}

