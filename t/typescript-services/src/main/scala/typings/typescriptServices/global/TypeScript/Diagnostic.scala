package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.DiagnosticInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Diagnostic")
@js.native
class Diagnostic protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Diagnostic {
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
    _arguments: js.Array[js.Any]
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[js.Any],
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ) = this()
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: Unit,
    additionalLocations: js.Array[typings.typescriptServices.TypeScript.Location]
  ) = this()
  
  /* private */ /* CompleteClass */
  var _additionalLocations: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _arguments: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _diagnosticKey: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _fileName: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _length: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _lineMap: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _start: js.Any = js.native
  
  /* CompleteClass */
  override def additionalLocations(): js.Array[typings.typescriptServices.TypeScript.Location] = js.native
  
  /* CompleteClass */
  override def arguments(): js.Array[js.Any] = js.native
  
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
object Diagnostic {
  
  @JSGlobal("TypeScript.Diagnostic")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def equals_(
    diagnostic1: typings.typescriptServices.TypeScript.Diagnostic,
    diagnostic2: typings.typescriptServices.TypeScript.Diagnostic
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(diagnostic1.asInstanceOf[js.Any], diagnostic2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
