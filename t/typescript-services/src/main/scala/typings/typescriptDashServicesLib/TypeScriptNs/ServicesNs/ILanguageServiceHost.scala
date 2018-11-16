package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILanguageServiceHost
  extends typescriptDashServicesLib.TypeScriptNs.ILogger
     with typescriptDashServicesLib.TypeScriptNs.IReferenceResolverHost {
  def getCompilationSettings(): typescriptDashServicesLib.TypeScriptNs.CompilationSettings
  def getDiagnosticsObject(): ILanguageServicesDiagnostics
  def getLocalizedDiagnosticMessages(): js.Any
  def getScriptByteOrderMark(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ByteOrderMark
  def getScriptFileNames(): js.Array[java.lang.String]
  def getScriptIsOpen(fileName: java.lang.String): scala.Boolean
  def getScriptVersion(fileName: java.lang.String): scala.Double
}

