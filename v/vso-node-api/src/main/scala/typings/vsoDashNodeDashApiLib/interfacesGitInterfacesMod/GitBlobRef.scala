package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitBlobRef extends js.Object {
  var _links: js.Any
  /**
    * SHA1 hash of git object
    */
  var objectId: java.lang.String
  /**
    * Size of blob content (in bytes)
    */
  var size: scala.Double
  var url: java.lang.String
}

object GitBlobRef {
  @scala.inline
  def apply(_links: js.Any, objectId: java.lang.String, size: scala.Double, url: java.lang.String): GitBlobRef = {
    val __obj = js.Dynamic.literal(_links = _links, objectId = objectId, size = size, url = url)
  
    __obj.asInstanceOf[GitBlobRef]
  }
}

