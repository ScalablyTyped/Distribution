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
    release: js.Function0[scala.Unit],
    setValueAt: js.Function3[scala.Double, scala.Double, scala.Boolean, scala.Unit],
    valueAt: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal(release = release, setValueAt = setValueAt, valueAt = valueAt)
  
    __obj.asInstanceOf[IBitMatrix]
  }
}

