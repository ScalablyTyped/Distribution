package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitTreeEntryRef extends js.Object {
  /**
    * Blob or tree
    */
  var gitObjectType: GitObjectType = js.native
  /**
    * Mode represented as octal string
    */
  var mode: String = js.native
  /**
    * SHA1 hash of git object
    */
  var objectId: String = js.native
  /**
    * Path relative to parent tree object
    */
  var relativePath: String = js.native
  /**
    * Size of content
    */
  var size: Double = js.native
  /**
    * url to retrieve tree or blob
    */
  var url: String = js.native
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
  @scala.inline
  implicit class GitTreeEntryRefOps[Self <: GitTreeEntryRef] (val x: Self) extends AnyVal {
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
    def setGitObjectType(value: GitObjectType): Self = this.set("gitObjectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

