package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LineMap")
@js.native
class LineMap protected () extends js.Object {
  def this(_computeLineStarts: js.Function0[js.Array[scala.Double]], length: scala.Double) = this()
  var _computeLineStarts: js.Any = js.native
  var _lineStarts: js.Any = js.native
  var length: js.Any = js.native
  def equals(other: LineMap): scala.Boolean = js.native
  def fillLineAndCharacterFromPosition(position: scala.Double, lineAndCharacter: ILineAndCharacter): scala.Unit = js.native
  def getLineAndCharacterFromPosition(position: scala.Double): LineAndCharacter = js.native
  def getLineNumberFromPosition(position: scala.Double): scala.Double = js.native
  def getLineStartPosition(lineNumber: scala.Double): scala.Double = js.native
  def getPosition(line: scala.Double, character: scala.Double): scala.Double = js.native
  def lineCount(): scala.Double = js.native
  def lineStarts(): js.Array[scala.Double] = js.native
  def toJSON(key: js.Any): typescriptDashServicesLib.Anon_Length = js.native
}

@JSGlobal("TypeScript.LineMap")
@js.native
object LineMap extends js.Object {
  var empty: typescriptDashServicesLib.TypeScriptNs.LineMap = js.native
}

