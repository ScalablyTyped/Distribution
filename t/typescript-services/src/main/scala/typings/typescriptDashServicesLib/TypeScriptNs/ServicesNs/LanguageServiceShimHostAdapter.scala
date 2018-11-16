package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.LanguageServiceShimHostAdapter")
@js.native
class LanguageServiceShimHostAdapter protected () extends ILanguageServiceHost {
  def this(shimHost: ILanguageServiceShimHost) = this()
  var shimHost: js.Any = js.native
  /* CompleteClass */
  override def debug(): scala.Boolean = js.native
  /* CompleteClass */
  override def directoryExists(path: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def error(): scala.Boolean = js.native
  /* CompleteClass */
  override def fatal(): scala.Boolean = js.native
  /* CompleteClass */
  override def fileExists(path: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def getCompilationSettings(): typescriptDashServicesLib.TypeScriptNs.CompilationSettings = js.native
  /* CompleteClass */
  override def getDiagnosticsObject(): ILanguageServicesDiagnostics = js.native
  /* CompleteClass */
  override def getLocalizedDiagnosticMessages(): js.Any = js.native
  /* CompleteClass */
  override def getParentDirectory(path: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getScriptByteOrderMark(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ByteOrderMark = js.native
  /* CompleteClass */
  override def getScriptFileNames(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def getScriptIsOpen(fileName: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def getScriptSnapshot(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot = js.native
  /* CompleteClass */
  override def getScriptVersion(fileName: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def information(): scala.Boolean = js.native
  /* CompleteClass */
  override def log(s: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def resolveRelativePath(path: java.lang.String, directory: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def warning(): scala.Boolean = js.native
}

