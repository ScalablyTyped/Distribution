package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptReferenceHost extends StObject {
  
  def getCompilerOptions(): CompilerOptions = js.native
  
  def getCurrentDirectory(): java.lang.String = js.native
  
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile] = js.native
  
  def getSourceFileByPath(path: Path): js.UndefOr[SourceFile] = js.native
}
object ScriptReferenceHost {
  
  @scala.inline
  def apply(
    getCompilerOptions: () => CompilerOptions,
    getCurrentDirectory: () => java.lang.String,
    getSourceFile: java.lang.String => js.UndefOr[SourceFile],
    getSourceFileByPath: Path => js.UndefOr[SourceFile]
  ): ScriptReferenceHost = {
    val __obj = js.Dynamic.literal(getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getSourceFile = js.Any.fromFunction1(getSourceFile), getSourceFileByPath = js.Any.fromFunction1(getSourceFileByPath))
    __obj.asInstanceOf[ScriptReferenceHost]
  }
  
  @scala.inline
  implicit class ScriptReferenceHostMutableBuilder[Self <: ScriptReferenceHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCompilerOptions(value: () => CompilerOptions): Self = StObject.set(x, "getCompilerOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSourceFile(value: java.lang.String => js.UndefOr[SourceFile]): Self = StObject.set(x, "getSourceFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSourceFileByPath(value: Path => js.UndefOr[SourceFile]): Self = StObject.set(x, "getSourceFileByPath", js.Any.fromFunction1(value))
  }
}
