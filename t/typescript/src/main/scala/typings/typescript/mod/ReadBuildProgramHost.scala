package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadBuildProgramHost extends StObject {
  
  def getCurrentDirectory(): java.lang.String
  
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
  
  def useCaseSensitiveFileNames(): Boolean
}
object ReadBuildProgramHost {
  
  @scala.inline
  def apply(
    getCurrentDirectory: () => java.lang.String,
    readFile: java.lang.String => js.UndefOr[java.lang.String],
    useCaseSensitiveFileNames: () => Boolean
  ): ReadBuildProgramHost = {
    val __obj = js.Dynamic.literal(getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), readFile = js.Any.fromFunction1(readFile), useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames))
    __obj.asInstanceOf[ReadBuildProgramHost]
  }
  
  @scala.inline
  implicit class ReadBuildProgramHostMutableBuilder[Self <: ReadBuildProgramHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadFile(value: java.lang.String => js.UndefOr[java.lang.String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseCaseSensitiveFileNames(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
  }
}
