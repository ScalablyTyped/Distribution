package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptReferenceHost extends StObject {
  
  def getCompilerOptions(): CompilerOptions
  
  def getCurrentDirectory(): java.lang.String
  
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile]
  
  def getSourceFileByPath(path: Path): js.UndefOr[SourceFile]
}
object ScriptReferenceHost {
  
  inline def apply(
    getCompilerOptions: () => CompilerOptions,
    getCurrentDirectory: () => java.lang.String,
    getSourceFile: java.lang.String => js.UndefOr[SourceFile],
    getSourceFileByPath: Path => js.UndefOr[SourceFile]
  ): ScriptReferenceHost = {
    val __obj = js.Dynamic.literal(getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getSourceFile = js.Any.fromFunction1(getSourceFile), getSourceFileByPath = js.Any.fromFunction1(getSourceFileByPath))
    __obj.asInstanceOf[ScriptReferenceHost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptReferenceHost] (val x: Self) extends AnyVal {
    
    inline def setGetCompilerOptions(value: () => CompilerOptions): Self = StObject.set(x, "getCompilerOptions", js.Any.fromFunction0(value))
    
    inline def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetSourceFile(value: java.lang.String => js.UndefOr[SourceFile]): Self = StObject.set(x, "getSourceFile", js.Any.fromFunction1(value))
    
    inline def setGetSourceFileByPath(value: Path => js.UndefOr[SourceFile]): Self = StObject.set(x, "getSourceFileByPath", js.Any.fromFunction1(value))
  }
}
