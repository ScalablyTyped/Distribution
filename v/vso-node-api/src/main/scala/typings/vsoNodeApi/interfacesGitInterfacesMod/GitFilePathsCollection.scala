package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitFilePathsCollection extends StObject {
  
  var commitId: String
  
  var paths: js.Array[String]
  
  var url: String
}
object GitFilePathsCollection {
  
  inline def apply(commitId: String, paths: js.Array[String], url: String): GitFilePathsCollection = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitFilePathsCollection]
  }
  
  extension [Self <: GitFilePathsCollection](x: Self) {
    
    inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
