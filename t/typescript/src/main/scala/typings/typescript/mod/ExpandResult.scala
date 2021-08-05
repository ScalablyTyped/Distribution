package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandResult extends StObject {
  
  var fileNames: js.Array[java.lang.String]
  
  var wildcardDirectories: MapLike[WatchDirectoryFlags]
}
object ExpandResult {
  
  inline def apply(fileNames: js.Array[java.lang.String], wildcardDirectories: MapLike[WatchDirectoryFlags]): ExpandResult = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], wildcardDirectories = wildcardDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandResult]
  }
  
  extension [Self <: ExpandResult](x: Self) {
    
    inline def setFileNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    inline def setFileNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "fileNames", js.Array(value :_*))
    
    inline def setWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = StObject.set(x, "wildcardDirectories", value.asInstanceOf[js.Any])
  }
}
