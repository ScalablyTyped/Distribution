package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitMatrix extends js.Object {
  def release(): scala.Unit
  def setValueAt(x: scala.Double, y: scala.Double, value: scala.Boolean): scala.Unit
  def valueAt(x: scala.Double, y: scala.Double): scala.Boolean
}

object IBitMatrix {
  @scala.inline
  def apply(
    release: () => scala.Unit,
    setValueAt: (scala.Double, scala.Double, scala.Boolean) => scala.Unit,
    valueAt: (scala.Double, scala.Double) => scala.Boolean
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction3(setValueAt), valueAt = js.Any.fromFunction2(valueAt))
  
    __obj.asInstanceOf[IBitMatrix]
  }
}

