package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileExists extends StObject {
  
  def fileExists(fileName: String): Boolean = js.native
  
  def getExecutingFilePath(): String = js.native
  
  def readFile(fileName: String): js.UndefOr[String] = js.native
  
  def resolvePath(path: String): String = js.native
}
object FileExists {
  
  @scala.inline
  def apply(
    fileExists: String => Boolean,
    getExecutingFilePath: () => String,
    readFile: String => js.UndefOr[String],
    resolvePath: String => String
  ): FileExists = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
    __obj.asInstanceOf[FileExists]
  }
  
  @scala.inline
  implicit class FileExistsMutableBuilder[Self <: FileExists] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExecutingFilePath(value: () => String): Self = StObject.set(x, "getExecutingFilePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadFile(value: String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolvePath(value: String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
  }
}
