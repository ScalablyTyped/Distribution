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
    debug: js.Function0[scala.Boolean],
    directoryExists: js.Function1[java.lang.String, scala.Boolean],
    error: js.Function0[scala.Boolean],
    fatal: js.Function0[scala.Boolean],
    fileExists: js.Function1[java.lang.String, scala.Boolean],
    getCompilationSettings: js.Function0[typescriptDashServicesLib.TypeScriptNs.CompilationSettings],
    getDiagnosticsObject: js.Function0[ILanguageServicesDiagnostics],
    getLocalizedDiagnosticMessages: js.Function0[js.Any],
    getParentDirectory: js.Function1[java.lang.String, java.lang.String],
    getScriptByteOrderMark: js.Function1[java.lang.String, typescriptDashServicesLib.TypeScriptNs.ByteOrderMark],
    getScriptFileNames: js.Function0[js.Array[java.lang.String]],
    getScriptIsOpen: js.Function1[java.lang.String, scala.Boolean],
    getScriptSnapshot: js.Function1[java.lang.String, typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot],
    getScriptVersion: js.Function1[java.lang.String, scala.Double],
    information: js.Function0[scala.Boolean],
    log: js.Function1[java.lang.String, scala.Unit],
    resolveRelativePath: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    warning: js.Function0[scala.Boolean]
  ): ILanguageServiceHost = {
    val __obj = js.Dynamic.literal(debug = debug, directoryExists = directoryExists, error = error, fatal = fatal, fileExists = fileExists, getCompilationSettings = getCompilationSettings, getDiagnosticsObject = getDiagnosticsObject, getLocalizedDiagnosticMessages = getLocalizedDiagnosticMessages, getParentDirectory = getParentDirectory, getScriptByteOrderMark = getScriptByteOrderMark, getScriptFileNames = getScriptFileNames, getScriptIsOpen = getScriptIsOpen, getScriptSnapshot = getScriptSnapshot, getScriptVersion = getScriptVersion, information = information, log = log, resolveRelativePath = resolveRelativePath, warning = warning)
  
    __obj.asInstanceOf[ILanguageServiceHost]
  }
}

