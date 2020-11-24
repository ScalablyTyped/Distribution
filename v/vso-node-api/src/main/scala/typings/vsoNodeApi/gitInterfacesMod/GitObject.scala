package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitObject extends js.Object {
  
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
  implicit class GitObjectOps[Self <: GitObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: GitObjectType): Self = this.set("objectType", value.asInstanceOf[js.Any])
  }
}
