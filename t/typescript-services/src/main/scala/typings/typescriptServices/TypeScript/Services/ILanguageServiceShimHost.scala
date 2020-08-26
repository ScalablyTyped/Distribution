package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageServiceShimHost extends ILogger {
  def directoryExists(path: String): Boolean = js.native
  def fileExists(path: String): Boolean = js.native
  def getCompilationSettings(): String = js.native
  def getDiagnosticsObject(): ILanguageServicesDiagnostics = js.native
  def getLocalizedDiagnosticMessages(): String = js.native
  def getParentDirectory(path: String): String = js.native
  def getScriptByteOrderMark(fileName: String): Double = js.native
  def getScriptFileNames(): String = js.native
  def getScriptIsOpen(fileName: String): Boolean = js.native
  def getScriptSnapshot(fileName: String): IScriptSnapshotShim = js.native
  def getScriptVersion(fileName: String): Double = js.native
  def resolveRelativePath(path: String, directory: String): String = js.native
}

object ILanguageServiceShimHost {
  @scala.inline
  def apply(
    debug: () => Boolean,
    directoryExists: String => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    fileExists: String => Boolean,
    getCompilationSettings: () => String,
    getDiagnosticsObject: () => ILanguageServicesDiagnostics,
    getLocalizedDiagnosticMessages: () => String,
    getParentDirectory: String => String,
    getScriptByteOrderMark: String => Double,
    getScriptFileNames: () => String,
    getScriptIsOpen: String => Boolean,
    getScriptSnapshot: String => IScriptSnapshotShim,
    getScriptVersion: String => Double,
    information: () => Boolean,
    log: String => Unit,
    resolveRelativePath: (String, String) => String,
    warning: () => Boolean
  ): ILanguageServiceShimHost = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[ILanguageServiceShimHost]
  }
  @scala.inline
  implicit class ILanguageServiceShimHostOps[Self <: ILanguageServiceShimHost] (val x: Self) extends AnyVal {
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
    def setDirectoryExists(value: String => Boolean): Self = this.set("directoryExists", js.Any.fromFunction1(value))
    @scala.inline
    def setFileExists(value: String => Boolean): Self = this.set("fileExists", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCompilationSettings(value: () => String): Self = this.set("getCompilationSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDiagnosticsObject(value: () => ILanguageServicesDiagnostics): Self = this.set("getDiagnosticsObject", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocalizedDiagnosticMessages(value: () => String): Self = this.set("getLocalizedDiagnosticMessages", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentDirectory(value: String => String): Self = this.set("getParentDirectory", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptByteOrderMark(value: String => Double): Self = this.set("getScriptByteOrderMark", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptFileNames(value: () => String): Self = this.set("getScriptFileNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScriptIsOpen(value: String => Boolean): Self = this.set("getScriptIsOpen", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptSnapshot(value: String => IScriptSnapshotShim): Self = this.set("getScriptSnapshot", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptVersion(value: String => Double): Self = this.set("getScriptVersion", js.Any.fromFunction1(value))
    @scala.inline
    def setResolveRelativePath(value: (String, String) => String): Self = this.set("resolveRelativePath", js.Any.fromFunction2(value))
  }
  
}

