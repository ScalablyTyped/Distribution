package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILanguageServiceShimHost
  extends typescriptDashServicesLib.TypeScriptNs.ILogger {
  def directoryExists(path: java.lang.String): scala.Boolean
  def fileExists(path: java.lang.String): scala.Boolean
  def getCompilationSettings(): java.lang.String
  def getDiagnosticsObject(): ILanguageServicesDiagnostics
  def getLocalizedDiagnosticMessages(): java.lang.String
  def getParentDirectory(path: java.lang.String): java.lang.String
  def getScriptByteOrderMark(fileName: java.lang.String): scala.Double
  def getScriptFileNames(): java.lang.String
  def getScriptIsOpen(fileName: java.lang.String): scala.Boolean
  def getScriptSnapshot(fileName: java.lang.String): IScriptSnapshotShim
  def getScriptVersion(fileName: java.lang.String): scala.Double
  def resolveRelativePath(path: java.lang.String, directory: java.lang.String): java.lang.String
}

