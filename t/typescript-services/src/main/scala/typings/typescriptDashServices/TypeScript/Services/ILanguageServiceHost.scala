package typings.typescriptDashServices.TypeScript.Services

import typings.typescriptDashServices.TypeScript.ByteOrderMark
import typings.typescriptDashServices.TypeScript.CompilationSettings
import typings.typescriptDashServices.TypeScript.ILogger
import typings.typescriptDashServices.TypeScript.IReferenceResolverHost
import typings.typescriptDashServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServiceHost
  extends ILogger
     with IReferenceResolverHost {
  def getCompilationSettings(): CompilationSettings
  def getDiagnosticsObject(): ILanguageServicesDiagnostics
  def getLocalizedDiagnosticMessages(): js.Any
  def getScriptByteOrderMark(fileName: String): ByteOrderMark
  def getScriptFileNames(): js.Array[String]
  def getScriptIsOpen(fileName: String): Boolean
  def getScriptVersion(fileName: String): Double
}

object ILanguageServiceHost {
  @scala.inline
  def apply(
    debug: () => Boolean,
    directoryExists: String => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    fileExists: String => Boolean,
    getCompilationSettings: () => CompilationSettings,
    getDiagnosticsObject: () => ILanguageServicesDiagnostics,
    getLocalizedDiagnosticMessages: () => js.Any,
    getParentDirectory: String => String,
    getScriptByteOrderMark: String => ByteOrderMark,
    getScriptFileNames: () => js.Array[String],
    getScriptIsOpen: String => Boolean,
    getScriptSnapshot: String => IScriptSnapshot,
    getScriptVersion: String => Double,
    information: () => Boolean,
    log: String => Unit,
    resolveRelativePath: (String, String) => String,
    warning: () => Boolean
  ): ILanguageServiceHost = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = js.Any.fromFunction0(warning))
  
    __obj.asInstanceOf[ILanguageServiceHost]
  }
}

