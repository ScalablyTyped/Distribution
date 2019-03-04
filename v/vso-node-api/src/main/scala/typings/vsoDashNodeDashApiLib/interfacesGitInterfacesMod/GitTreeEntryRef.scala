package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeEntryRef extends js.Object {
  /**
    * Blob or tree
    */
  var gitObjectType: GitObjectType
  /**
    * Mode represented as octal string
    */
  var mode: java.lang.String
  /**
    * SHA1 hash of git object
    */
  var objectId: java.lang.String
  /**
    * Path relative to parent tree object
    */
  var relativePath: java.lang.String
  /**
    * Size of content
    */
  var size: scala.Double
  /**
    * url to retrieve tree or blob
    */
  var url: java.lang.String
}

object GitTreeEntryRef {
  @scala.inline
  def apply(
    gitObjectType: GitObjectType,
    mode: java.lang.String,
    objectId: java.lang.String,
    relativePath: java.lang.String,
    size: scala.Double,
    url: java.lang.String
  ): GitTreeEntryRef = {
    val __obj = js.Dynamic.literal(gitObjectType = gitObjectType, mode = mode, objectId = objectId, relativePath = relativePath, size = size, url = url)
  
    __obj.asInstanceOf[GitTreeEntryRef]
  }
}

