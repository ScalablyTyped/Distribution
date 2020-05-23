package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.DiagnosticInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Diagnostic")
@js.native
class Diagnostic protected ()
  extends typings.typescriptServices.TypeScript.Diagnostic {
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ) = this()
  /* CompleteClass */
  override var _additionalLocations: js.Any = js.native
  /* CompleteClass */
  override var _arguments: js.Any = js.native
  /* CompleteClass */
  override var _diagnosticKey: js.Any = js.native
  /* CompleteClass */
  override var _fileName: js.Any = js.native
  /* CompleteClass */
  override var _length: js.Any = js.native
  /* CompleteClass */
  override var _lineMap: js.Any = js.native
  /* CompleteClass */
  override var _start: js.Any = js.native
  /* CompleteClass */
  override def additionalLocations(): js.Array[typings.typescriptServices.TypeScript.Location] = js.native
  /* CompleteClass */
  override def arguments(): js.Array[_] = js.native
  /* CompleteClass */
  override def character(): Double = js.native
  /* CompleteClass */
  override def diagnosticKey(): String = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  override def info(): DiagnosticInfo = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def line(): Double = js.native
  /* CompleteClass */
  override def lineMap(): typings.typescriptServices.TypeScript.LineMap = js.native
  /* CompleteClass */
  override def message(): String = js.native
  /* CompleteClass */
  override def start(): Double = js.native
  /* CompleteClass */
  override def text(): String = js.native
  /* CompleteClass */
  override def toJSON(key: js.Any): js.Any = js.native
}

/* static members */
@JSImport("typescript-services", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  def equals(
    diagnostic1: typings.typescriptServices.TypeScript.Diagnostic,
    diagnostic2: typings.typescriptServices.TypeScript.Diagnostic
  ): Boolean = js.native
}

