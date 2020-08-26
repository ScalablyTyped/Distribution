package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ByteOrderMark
import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.IReferenceResolverHost
import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageServiceHost
  extends ILogger
     with IReferenceResolverHost {
  def getCompilationSettings(): CompilationSettings = js.native
  def getDiagnosticsObject(): ILanguageServicesDiagnostics = js.native
  def getLocalizedDiagnosticMessages(): js.Any = js.native
  def getScriptByteOrderMark(fileName: String): ByteOrderMark = js.native
  def getScriptFileNames(): js.Array[String] = js.native
  def getScriptIsOpen(fileName: String): Boolean = js.native
  def getScriptVersion(fileName: String): Double = js.native
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
  @scala.inline
  implicit class ILanguageServiceHostOps[Self <: ILanguageServiceHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCompilationSettings(value: () => CompilationSettings): Self = this.set("getCompilationSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDiagnosticsObject(value: () => ILanguageServicesDiagnostics): Self = this.set("getDiagnosticsObject", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocalizedDiagnosticMessages(value: () => js.Any): Self = this.set("getLocalizedDiagnosticMessages", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScriptByteOrderMark(value: String => ByteOrderMark): Self = this.set("getScriptByteOrderMark", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptFileNames(value: () => js.Array[String]): Self = this.set("getScriptFileNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScriptIsOpen(value: String => Boolean): Self = this.set("getScriptIsOpen", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptVersion(value: String => Double): Self = this.set("getScriptVersion", js.Any.fromFunction1(value))
  }
  
}

