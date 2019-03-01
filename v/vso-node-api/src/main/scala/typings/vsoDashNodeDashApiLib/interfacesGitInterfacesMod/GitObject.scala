package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitObject extends js.Object {
  /**
    * Object Id (Sha1Id).
    */
  var objectId: java.lang.String
  /**
    * Type of object (Commit, Tree, Blob, Tag)
    */
  var objectType: GitObjectType
}

object GitObject {
  @scala.inline
  def apply(objectId: java.lang.String, objectType: GitObjectType): GitObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectId")(objectId)
    __obj.updateDynamic("objectType")(objectType)
    __obj.asInstanceOf[GitObject]
  }
}

