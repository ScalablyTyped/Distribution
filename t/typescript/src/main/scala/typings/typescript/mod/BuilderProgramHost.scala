package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderProgramHost extends StObject {
  
  /**
    * If provided this would be used this hash instead of actual file shape text for detecting changes
    */
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.undefined
  
  /**
    * return true if file names are treated with case sensitivity
    */
  def useCaseSensitiveFileNames(): Boolean
  
  /**
    * When emit or emitNextAffectedFile are called without writeFile,
    * this callback if present would be used to write files
    */
  var writeFile: js.UndefOr[WriteFileCallback] = js.undefined
}
object BuilderProgramHost {
  
  @scala.inline
  def apply(useCaseSensitiveFileNames: () => Boolean): BuilderProgramHost = {
    val __obj = js.Dynamic.literal(useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames))
    __obj.asInstanceOf[BuilderProgramHost]
  }
  
  @scala.inline
  implicit class BuilderProgramHostMutableBuilder[Self <: BuilderProgramHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateHash(value: /* data */ java.lang.String => java.lang.String): Self = StObject.set(x, "createHash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateHashUndefined: Self = StObject.set(x, "createHash", js.undefined)
    
    @scala.inline
    def setUseCaseSensitiveFileNames(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteFile(
      value: (/* fileName */ java.lang.String, /* data */ java.lang.String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]]) => Unit
    ): Self = StObject.set(x, "writeFile", js.Any.fromFunction5(value))
    
    @scala.inline
    def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
  }
}
