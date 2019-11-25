package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcMergeSource extends js.Object {
  /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
  var isRename: Boolean
  /**
    * The server item of the merge source
    */
  var serverItem: String
  /**
    * Start of the version range
    */
  var versionFrom: Double
  /**
    * End of the version range
    */
  var versionTo: Double
}

object TfvcMergeSource {
  @scala.inline
  def apply(isRename: Boolean, serverItem: String, versionFrom: Double, versionTo: Double): TfvcMergeSource = {
    val __obj = js.Dynamic.literal(isRename = isRename.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any], versionFrom = versionFrom.asInstanceOf[js.Any], versionTo = versionTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcMergeSource]
  }
}

