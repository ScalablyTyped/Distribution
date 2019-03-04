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
    release: js.Function0[scala.Unit],
    setValueAt: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    valueAt: js.Function1[scala.Double, scala.Boolean]
  ): IBitVector = {
    val __obj = js.Dynamic.literal(release = release, setValueAt = setValueAt, valueAt = valueAt)
  
    __obj.asInstanceOf[IBitVector]
  }
}

