package typings.webpack.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directories extends StObject {
  
  /**
  		 * list of directories
  		 */
  var directories: Set[String]
  
  /**
  		 * list of files
  		 */
  var files: Set[String]
  
  /**
  		 * list of missing entries
  		 */
  var missing: Set[String]
}
object Directories {
  
  inline def apply(directories: Set[String], files: Set[String], missing: Set[String]): Directories = {
    val __obj = js.Dynamic.literal(directories = directories.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Directories] (val x: Self) extends AnyVal {
    
    inline def setDirectories(value: Set[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Set[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setMissing(value: Set[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
  }
}
