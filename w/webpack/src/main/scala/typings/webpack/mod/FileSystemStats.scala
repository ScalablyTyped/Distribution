package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemStats extends StObject {
  
  def isDirectory(): Boolean
  
  def isFile(): Boolean
}
object FileSystemStats {
  
  inline def apply(isDirectory: () => Boolean, isFile: () => Boolean): FileSystemStats = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile))
    __obj.asInstanceOf[FileSystemStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemStats] (val x: Self) extends AnyVal {
    
    inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
  }
}
