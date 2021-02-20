package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ByteOrderMark
import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.IReferenceResolverHost
import typings.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ILanguageServiceHostMutableBuilder[Self <: ILanguageServiceHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCompilationSettings(value: () => CompilationSettings): Self = StObject.set(x, "getCompilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDiagnosticsObject(value: () => ILanguageServicesDiagnostics): Self = StObject.set(x, "getDiagnosticsObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocalizedDiagnosticMessages(value: () => js.Any): Self = StObject.set(x, "getLocalizedDiagnosticMessages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptByteOrderMark(value: String => ByteOrderMark): Self = StObject.set(x, "getScriptByteOrderMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptFileNames(value: () => js.Array[String]): Self = StObject.set(x, "getScriptFileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptIsOpen(value: String => Boolean): Self = StObject.set(x, "getScriptIsOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptVersion(value: String => Double): Self = StObject.set(x, "getScriptVersion", js.Any.fromFunction1(value))
  }
}
