package typings.typescriptDashServices.TypeScriptNs

import typings.typescriptDashServices.Anon_Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LineMap")
@js.native
class LineMap protected () extends js.Object {
  def this(_computeLineStarts: js.Function0[js.Array[Double]], length: Double) = this()
  var _computeLineStarts: js.Any = js.native
  var _lineStarts: js.Any = js.native
  var length: js.Any = js.native
  def equals(other: LineMap): Boolean = js.native
  def fillLineAndCharacterFromPosition(position: Double, lineAndCharacter: ILineAndCharacter): Unit = js.native
  def getLineAndCharacterFromPosition(position: Double): LineAndCharacter = js.native
  def getLineNumberFromPosition(position: Double): Double = js.native
  def getLineStartPosition(lineNumber: Double): Double = js.native
  def getPosition(line: Double, character: Double): Double = js.native
  def lineCount(): Double = js.native
  def lineStarts(): js.Array[Double] = js.native
  def toJSON(key: js.Any): Anon_Length = js.native
}

/* static members */
@JSGlobal("TypeScript.LineMap")
@js.native
object LineMap extends js.Object {
  var empty: LineMap = js.native
}

