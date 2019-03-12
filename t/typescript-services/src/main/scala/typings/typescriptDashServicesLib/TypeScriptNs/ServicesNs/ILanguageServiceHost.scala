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

object ILanguageServiceHost {
  @scala.inline
  def apply(
    debug: () => scala.Boolean,
    directoryExists: java.lang.String => scala.Boolean,
    error: () => scala.Boolean,
    fatal: () => scala.Boolean,
    fileExists: java.lang.String => scala.Boolean,
    getCompilationSettings: () => typescriptDashServicesLib.TypeScriptNs.CompilationSettings,
    getDiagnosticsObject: () => ILanguageServicesDiagnostics,
    getLocalizedDiagnosticMessages: () => js.Any,
    getParentDirectory: java.lang.String => java.lang.String,
    getScriptByteOrderMark: java.lang.String => typescriptDashServicesLib.TypeScriptNs.ByteOrderMark,
    getScriptFileNames: () => js.Array[java.lang.String],
    getScriptIsOpen: java.lang.String => scala.Boolean,
    getScriptSnapshot: java.lang.String => typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot,
    getScriptVersion: java.lang.String => scala.Double,
    information: () => scala.Boolean,
    log: java.lang.String => scala.Unit,
    resolveRelativePath: (java.lang.String, java.lang.String) => java.lang.String,
    warning: () => scala.Boolean
  ): ILanguageServiceHost = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = js.Any.fromFunction0(warning))
  
    __obj.asInstanceOf[ILanguageServiceHost]
  }
}

