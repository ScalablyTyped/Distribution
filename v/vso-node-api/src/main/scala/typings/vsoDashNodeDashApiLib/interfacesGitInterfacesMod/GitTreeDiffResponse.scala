package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeDiffResponse extends js.Object {
  /**
    * The HTTP client methods find the continuation token header in the response and populate this field.
    */
  var continuationToken: js.Array[java.lang.String]
  var treeDiff: GitTreeDiff
}

object GitTreeDiffResponse {
  @scala.inline
  def apply(continuationToken: js.Array[java.lang.String], treeDiff: GitTreeDiff): GitTreeDiffResponse = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken, treeDiff = treeDiff)
  
    __obj.asInstanceOf[GitTreeDiffResponse]
  }
}

