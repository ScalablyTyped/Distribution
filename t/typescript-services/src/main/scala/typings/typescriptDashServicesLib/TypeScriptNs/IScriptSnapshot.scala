package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScriptSnapshot extends js.Object {
  def getLength(): scala.Double
  def getLineStartPositions(): js.Array[scala.Double]
  def getText(start: scala.Double, end: scala.Double): java.lang.String
  def getTextChangeRangeSinceVersion(scriptVersion: scala.Double): TextChangeRange
}

object IScriptSnapshot {
  @scala.inline
  def apply(
    getLength: js.Function0[scala.Double],
    getLineStartPositions: js.Function0[js.Array[scala.Double]],
    getText: js.Function2[scala.Double, scala.Double, java.lang.String],
    getTextChangeRangeSinceVersion: js.Function1[scala.Double, TextChangeRange]
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getLineStartPositions")(getLineStartPositions)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTextChangeRangeSinceVersion")(getTextChangeRangeSinceVersion)
    __obj.asInstanceOf[IScriptSnapshot]
  }
}

