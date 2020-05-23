package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ILineAndCharacter
import typings.typescriptServices.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LineMap")
@js.native
class LineMap protected ()
  extends typings.typescriptServices.TypeScript.LineMap {
  def this(_computeLineStarts: js.Function0[js.Array[Double]], length: Double) = this()
  /* CompleteClass */
  override var _computeLineStarts: js.Any = js.native
  /* CompleteClass */
  override var _lineStarts: js.Any = js.native
  /* CompleteClass */
  override var length: js.Any = js.native
  /* CompleteClass */
  override def equals(other: typings.typescriptServices.TypeScript.LineMap): Boolean = js.native
  /* CompleteClass */
  override def fillLineAndCharacterFromPosition(position: Double, lineAndCharacter: ILineAndCharacter): Unit = js.native
  /* CompleteClass */
  override def getLineAndCharacterFromPosition(position: Double): typings.typescriptServices.TypeScript.LineAndCharacter = js.native
  /* CompleteClass */
  override def getLineNumberFromPosition(position: Double): Double = js.native
  /* CompleteClass */
  override def getLineStartPosition(lineNumber: Double): Double = js.native
  /* CompleteClass */
  override def getPosition(line: Double, character: Double): Double = js.native
  /* CompleteClass */
  override def lineCount(): Double = js.native
  /* CompleteClass */
  override def lineStarts(): js.Array[Double] = js.native
  /* CompleteClass */
  override def toJSON(key: js.Any): Length = js.native
}

/* static members */
@JSGlobal("TypeScript.LineMap")
@js.native
object LineMap extends js.Object {
  var empty: typings.typescriptServices.TypeScript.LineMap = js.native
}

