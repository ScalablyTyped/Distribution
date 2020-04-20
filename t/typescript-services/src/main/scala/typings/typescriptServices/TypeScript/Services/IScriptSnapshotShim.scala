package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScriptSnapshotShim extends js.Object {
  def getLength(): Double
  def getLineStartPositions(): String
  def getText(start: Double, end: Double): String
  def getTextChangeRangeSinceVersion(scriptVersion: Double): String
}

object IScriptSnapshotShim {
  @scala.inline
  def apply(
    getLength: () => Double,
    getLineStartPositions: () => String,
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => String
  ): IScriptSnapshotShim = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshotShim]
  }
}

