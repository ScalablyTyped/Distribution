package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandResult extends StObject {
  
  var fileNames: js.Array[java.lang.String] = js.native
  
  var wildcardDirectories: MapLike[WatchDirectoryFlags] = js.native
}
object ExpandResult {
  
  @scala.inline
  def apply(fileNames: js.Array[java.lang.String], wildcardDirectories: MapLike[WatchDirectoryFlags]): ExpandResult = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], wildcardDirectories = wildcardDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandResult]
  }
  
  @scala.inline
  implicit class ExpandResultMutableBuilder[Self <: ExpandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "fileNames", js.Array(value :_*))
    
    @scala.inline
    def setWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = StObject.set(x, "wildcardDirectories", value.asInstanceOf[js.Any])
  }
}
