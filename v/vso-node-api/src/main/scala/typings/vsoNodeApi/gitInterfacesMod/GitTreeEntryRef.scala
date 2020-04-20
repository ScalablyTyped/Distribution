package typings.vsoNodeApi.gitInterfacesMod

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
  @scala.inline
  def apply(
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
}

