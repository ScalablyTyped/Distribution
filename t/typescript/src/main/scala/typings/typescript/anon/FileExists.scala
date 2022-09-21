package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileExists extends StObject {
  
  def fileExists(fileName: String): Boolean
  
  def getExecutingFilePath(): String
  
  def readFile(fileName: String): js.UndefOr[String]
  
  def resolvePath(path: String): String
}
object FileExists {
  
  inline def apply(
    fileExists: String => Boolean,
    getExecutingFilePath: () => String,
    readFile: String => js.UndefOr[String],
    resolvePath: String => String
  ): FileExists = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
    __obj.asInstanceOf[FileExists]
  }
  
  extension [Self <: FileExists](x: Self) {
    
    inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setGetExecutingFilePath(value: () => String): Self = StObject.set(x, "getExecutingFilePath", js.Any.fromFunction0(value))
    
    inline def setReadFile(value: String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    inline def setResolvePath(value: String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
  }
}
