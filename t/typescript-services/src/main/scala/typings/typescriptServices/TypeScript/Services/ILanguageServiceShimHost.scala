package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageServiceShimHost
  extends StObject
     with ILogger {
  
  def directoryExists(path: String): Boolean
  
  def fileExists(path: String): Boolean
  
  def getCompilationSettings(): String
  
  def getDiagnosticsObject(): ILanguageServicesDiagnostics
  
  def getLocalizedDiagnosticMessages(): String
  
  def getParentDirectory(path: String): String
  
  def getScriptByteOrderMark(fileName: String): Double
  
  def getScriptFileNames(): String
  
  def getScriptIsOpen(fileName: String): Boolean
  
  def getScriptSnapshot(fileName: String): IScriptSnapshotShim
  
  def getScriptVersion(fileName: String): Double
  
  def resolveRelativePath(path: String, directory: String): String
}
object ILanguageServiceShimHost {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ILanguageServiceShimHost] (val x: Self) extends AnyVal {
    
    inline def setDirectoryExists(value: String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setGetCompilationSettings(value: () => String): Self = StObject.set(x, "getCompilationSettings", js.Any.fromFunction0(value))
    
    inline def setGetDiagnosticsObject(value: () => ILanguageServicesDiagnostics): Self = StObject.set(x, "getDiagnosticsObject", js.Any.fromFunction0(value))
    
    inline def setGetLocalizedDiagnosticMessages(value: () => String): Self = StObject.set(x, "getLocalizedDiagnosticMessages", js.Any.fromFunction0(value))
    
    inline def setGetParentDirectory(value: String => String): Self = StObject.set(x, "getParentDirectory", js.Any.fromFunction1(value))
    
    inline def setGetScriptByteOrderMark(value: String => Double): Self = StObject.set(x, "getScriptByteOrderMark", js.Any.fromFunction1(value))
    
    inline def setGetScriptFileNames(value: () => String): Self = StObject.set(x, "getScriptFileNames", js.Any.fromFunction0(value))
    
    inline def setGetScriptIsOpen(value: String => Boolean): Self = StObject.set(x, "getScriptIsOpen", js.Any.fromFunction1(value))
    
    inline def setGetScriptSnapshot(value: String => IScriptSnapshotShim): Self = StObject.set(x, "getScriptSnapshot", js.Any.fromFunction1(value))
    
    inline def setGetScriptVersion(value: String => Double): Self = StObject.set(x, "getScriptVersion", js.Any.fromFunction1(value))
    
    inline def setResolveRelativePath(value: (String, String) => String): Self = StObject.set(x, "resolveRelativePath", js.Any.fromFunction2(value))
  }
}
