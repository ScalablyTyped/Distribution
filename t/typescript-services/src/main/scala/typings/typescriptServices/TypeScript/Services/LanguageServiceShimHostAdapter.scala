package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ByteOrderMark
import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageServiceShimHostAdapter extends ILanguageServiceHost {
  var shimHost: js.Any
}

object LanguageServiceShimHostAdapter {
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
    shimHost: js.Any,
    warning: () => Boolean
  ): LanguageServiceShimHostAdapter = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), shimHost = shimHost.asInstanceOf[js.Any], warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[LanguageServiceShimHostAdapter]
  }
}

