package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitObject extends js.Object {
  /**
    * Object Id (Sha1Id).
    */
  var objectId: String
  /**
    * Type of object (Commit, Tree, Blob, Tag)
    */
  var objectType: GitObjectType
}

object GitObject {
  @scala.inline
  def apply(objectId: String, objectType: GitObjectType): GitObject = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitObject]
  }
}

