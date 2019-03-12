package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitVector extends js.Object {
  def release(): scala.Unit
  def setValueAt(index: scala.Double, value: scala.Boolean): scala.Unit
  def valueAt(index: scala.Double): scala.Boolean
}

object IBitVector {
  @scala.inline
  def apply(
    release: () => scala.Unit,
    setValueAt: (scala.Double, scala.Boolean) => scala.Unit,
    valueAt: scala.Double => scala.Boolean
  ): IBitVector = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction2(setValueAt), valueAt = js.Any.fromFunction1(valueAt))
  
    __obj.asInstanceOf[IBitVector]
  }
}

