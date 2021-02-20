package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitObject extends StObject {
  
  /**
    * Object Id (Sha1Id).
    */
  var objectId: String = js.native
  
  /**
    * Type of object (Commit, Tree, Blob, Tag)
    */
  var objectType: GitObjectType = js.native
}
object GitObject {
  
  @scala.inline
  def apply(objectId: String, objectType: GitObjectType): GitObject = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitObject]
  }
  
  @scala.inline
  implicit class GitObjectMutableBuilder[Self <: GitObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: GitObjectType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
