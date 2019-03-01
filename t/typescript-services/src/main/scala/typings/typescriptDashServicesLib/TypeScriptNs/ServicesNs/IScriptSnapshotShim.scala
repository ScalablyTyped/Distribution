package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScriptSnapshotShim extends js.Object {
  def getLength(): scala.Double
  def getLineStartPositions(): java.lang.String
  def getText(start: scala.Double, end: scala.Double): java.lang.String
  def getTextChangeRangeSinceVersion(scriptVersion: scala.Double): java.lang.String
}

object IScriptSnapshotShim {
  @scala.inline
  def apply(
    getLength: js.Function0[scala.Double],
    getLineStartPositions: js.Function0[java.lang.String],
    getText: js.Function2[scala.Double, scala.Double, java.lang.String],
    getTextChangeRangeSinceVersion: js.Function1[scala.Double, java.lang.String]
  ): IScriptSnapshotShim = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getLineStartPositions")(getLineStartPositions)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTextChangeRangeSinceVersion")(getTextChangeRangeSinceVersion)
    __obj.asInstanceOf[IScriptSnapshotShim]
  }
}

