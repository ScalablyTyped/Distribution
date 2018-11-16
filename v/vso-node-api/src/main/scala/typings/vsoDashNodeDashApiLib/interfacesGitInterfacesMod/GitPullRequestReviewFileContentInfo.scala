package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitPullRequestReviewFileContentInfo extends js.Object {
  var _links: js.Any
  /**
       * The file change path.
       */
  var path: java.lang.String
  /**
       * Content hash of on-disk representation of file content. Its calculated by the client by using SHA1 hash function. Ensure that uploaded file has same encoding as in source control.
       */
  var sHA1Hash: java.lang.String
}

