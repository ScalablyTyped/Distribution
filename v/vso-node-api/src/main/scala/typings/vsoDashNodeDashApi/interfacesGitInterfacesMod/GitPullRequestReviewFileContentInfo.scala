package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestReviewFileContentInfo extends js.Object {
  var _links: js.Any
  /**
    * The file change path.
    */
  var path: String
  /**
    * Content hash of on-disk representation of file content. Its calculated by the client by using SHA1 hash function. Ensure that uploaded file has same encoding as in source control.
    */
  var sHA1Hash: String
}

object GitPullRequestReviewFileContentInfo {
  @scala.inline
  def apply(_links: js.Any, path: String, sHA1Hash: String): GitPullRequestReviewFileContentInfo = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sHA1Hash = sHA1Hash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitPullRequestReviewFileContentInfo]
  }
}

