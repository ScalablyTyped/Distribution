package typings.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesQueryResult extends StObject {
  
  /** The file names. */
  var files: js.Array[String]
}
object FilesQueryResult {
  
  inline def apply(files: js.Array[String]): FilesQueryResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesQueryResult]
  }
  
  extension [Self <: FilesQueryResult](x: Self) {
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
