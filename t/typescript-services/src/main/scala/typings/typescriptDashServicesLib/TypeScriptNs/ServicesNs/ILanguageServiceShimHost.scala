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
    debug: () => scala.Boolean,
    directoryExists: java.lang.String => scala.Boolean,
    error: () => scala.Boolean,
    fatal: () => scala.Boolean,
    fileExists: java.lang.String => scala.Boolean,
    getCompilationSettings: () => java.lang.String,
    getDiagnosticsObject: () => ILanguageServicesDiagnostics,
    getLocalizedDiagnosticMessages: () => java.lang.String,
    getParentDirectory: java.lang.String => java.lang.String,
    getScriptByteOrderMark: java.lang.String => scala.Double,
    getScriptFileNames: () => java.lang.String,
    getScriptIsOpen: java.lang.String => scala.Boolean,
    getScriptSnapshot: java.lang.String => IScriptSnapshotShim,
    getScriptVersion: java.lang.String => scala.Double,
    information: () => scala.Boolean,
    log: java.lang.String => scala.Unit,
    resolveRelativePath: (java.lang.String, java.lang.String) => java.lang.String,
    warning: () => scala.Boolean
  ): ILanguageServiceShimHost = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = js.Any.fromFunction0(warning))
  
    __obj.asInstanceOf[ILanguageServiceShimHost]
  }
}

