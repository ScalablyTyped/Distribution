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

