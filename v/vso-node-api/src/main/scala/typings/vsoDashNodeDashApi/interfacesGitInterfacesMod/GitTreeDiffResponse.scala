package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeDiffResponse extends js.Object {
  /**
    * The HTTP client methods find the continuation token header in the response and populate this field.
    */
  var continuationToken: js.Array[String]
  var treeDiff: GitTreeDiff
}

object GitTreeDiffResponse {
  @scala.inline
  def apply(continuationToken: js.Array[String], treeDiff: GitTreeDiff): GitTreeDiffResponse = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken.asInstanceOf[js.Any], treeDiff = treeDiff.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitTreeDiffResponse]
  }
}

