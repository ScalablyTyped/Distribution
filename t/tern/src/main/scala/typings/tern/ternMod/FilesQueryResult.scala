package typings.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesQueryResult extends StObject {
  
  /** The file names. */
  var files: js.Array[String]
}
object FilesQueryResult {
  
  @scala.inline
  def apply(files: js.Array[String]): FilesQueryResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesQueryResult]
  }
  
  @scala.inline
  implicit class FilesQueryResultMutableBuilder[Self <: FilesQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
