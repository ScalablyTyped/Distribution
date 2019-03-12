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
    getLength: () => scala.Double,
    getLineStartPositions: () => java.lang.String,
    getText: (scala.Double, scala.Double) => java.lang.String,
    getTextChangeRangeSinceVersion: scala.Double => java.lang.String
  ): IScriptSnapshotShim = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
  
    __obj.asInstanceOf[IScriptSnapshotShim]
  }
}

