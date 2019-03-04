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

object ILanguageServiceShimHost {
  @scala.inline
  def apply(
    debug: js.Function0[scala.Boolean],
    directoryExists: js.Function1[java.lang.String, scala.Boolean],
    error: js.Function0[scala.Boolean],
    fatal: js.Function0[scala.Boolean],
    fileExists: js.Function1[java.lang.String, scala.Boolean],
    getCompilationSettings: js.Function0[java.lang.String],
    getDiagnosticsObject: js.Function0[ILanguageServicesDiagnostics],
    getLocalizedDiagnosticMessages: js.Function0[java.lang.String],
    getParentDirectory: js.Function1[java.lang.String, java.lang.String],
    getScriptByteOrderMark: js.Function1[java.lang.String, scala.Double],
    getScriptFileNames: js.Function0[java.lang.String],
    getScriptIsOpen: js.Function1[java.lang.String, scala.Boolean],
    getScriptSnapshot: js.Function1[java.lang.String, IScriptSnapshotShim],
    getScriptVersion: js.Function1[java.lang.String, scala.Double],
    information: js.Function0[scala.Boolean],
    log: js.Function1[java.lang.String, scala.Unit],
    resolveRelativePath: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    warning: js.Function0[scala.Boolean]
  ): ILanguageServiceShimHost = {
    val __obj = js.Dynamic.literal(debug = debug, directoryExists = directoryExists, error = error, fatal = fatal, fileExists = fileExists, getCompilationSettings = getCompilationSettings, getDiagnosticsObject = getDiagnosticsObject, getLocalizedDiagnosticMessages = getLocalizedDiagnosticMessages, getParentDirectory = getParentDirectory, getScriptByteOrderMark = getScriptByteOrderMark, getScriptFileNames = getScriptFileNames, getScriptIsOpen = getScriptIsOpen, getScriptSnapshot = getScriptSnapshot, getScriptVersion = getScriptVersion, information = information, log = log, resolveRelativePath = resolveRelativePath, warning = warning)
  
    __obj.asInstanceOf[ILanguageServiceShimHost]
  }
}

