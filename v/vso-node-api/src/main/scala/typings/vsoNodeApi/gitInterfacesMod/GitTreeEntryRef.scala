package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitTreeEntryRef extends StObject {
  
  /**
    * Blob or tree
    */
  var gitObjectType: GitObjectType
  
  /**
    * Mode represented as octal string
    */
  var mode: String
  
  /**
    * SHA1 hash of git object
    */
  var objectId: String
  
  /**
    * Path relative to parent tree object
    */
  var relativePath: String
  
  /**
    * Size of content
    */
  var size: Double
  
  /**
    * url to retrieve tree or blob
    */
  var url: String
}
object GitTreeEntryRef {
  
  inline def apply(
    gitObjectType: GitObjectType,
    mode: String,
    objectId: String,
    relativePath: String,
    size: Double,
    url: String
  ): GitTreeEntryRef = {
    val __obj = js.Dynamic.literal(gitObjectType = gitObjectType.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeEntryRef]
  }
  
  extension [Self <: GitTreeEntryRef](x: Self) {
    
    inline def setGitObjectType(value: GitObjectType): Self = StObject.set(x, "gitObjectType", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
