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

