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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("directoryExists")(directoryExists)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fatal")(fatal)
    __obj.updateDynamic("fileExists")(fileExists)
    __obj.updateDynamic("getCompilationSettings")(getCompilationSettings)
    __obj.updateDynamic("getDiagnosticsObject")(getDiagnosticsObject)
    __obj.updateDynamic("getLocalizedDiagnosticMessages")(getLocalizedDiagnosticMessages)
    __obj.updateDynamic("getParentDirectory")(getParentDirectory)
    __obj.updateDynamic("getScriptByteOrderMark")(getScriptByteOrderMark)
    __obj.updateDynamic("getScriptFileNames")(getScriptFileNames)
    __obj.updateDynamic("getScriptIsOpen")(getScriptIsOpen)
    __obj.updateDynamic("getScriptSnapshot")(getScriptSnapshot)
    __obj.updateDynamic("getScriptVersion")(getScriptVersion)
    __obj.updateDynamic("information")(information)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("resolveRelativePath")(resolveRelativePath)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[ILanguageServiceShimHost]
  }
}

