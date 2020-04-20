package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScriptSnapshot extends js.Object {
  def getLength(): Double
  def getLineStartPositions(): js.Array[Double]
  def getText(start: Double, end: Double): String
  def getTextChangeRangeSinceVersion(scriptVersion: Double): TextChangeRange
}

object IScriptSnapshot {
  @scala.inline
  def apply(
    getLength: () => Double,
    getLineStartPositions: () => js.Array[Double],
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => TextChangeRange
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshot]
  }
}

