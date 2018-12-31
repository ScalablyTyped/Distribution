package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcMergeSource extends js.Object {
  /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
  var isRename: scala.Boolean
  /**
    * The server item of the merge source
    */
  var serverItem: java.lang.String
  /**
    * Start of the version range
    */
  var versionFrom: scala.Double
  /**
    * End of the version range
    */
  var versionTo: scala.Double
}

