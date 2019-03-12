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
    getLength: () => scala.Double,
    getLineStartPositions: () => js.Array[scala.Double],
    getText: (scala.Double, scala.Double) => java.lang.String,
    getTextChangeRangeSinceVersion: scala.Double => TextChangeRange
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
  
    __obj.asInstanceOf[IScriptSnapshot]
  }
}

