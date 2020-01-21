package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitBlobRef extends js.Object {
  var _links: js.Any
  /**
    * SHA1 hash of git object
    */
  var objectId: String
  /**
    * Size of blob content (in bytes)
    */
  var size: Double
  var url: String
}

object GitBlobRef {
  @scala.inline
  def apply(_links: js.Any, objectId: String, size: Double, url: String): GitBlobRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitBlobRef]
  }
}

