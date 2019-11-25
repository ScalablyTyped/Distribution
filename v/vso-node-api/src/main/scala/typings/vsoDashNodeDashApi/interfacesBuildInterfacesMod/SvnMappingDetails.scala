package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvnMappingDetails extends js.Object {
  /**
    * The depth.
    */
  var depth: Double
  /**
    * Indicates whether to ignore externals.
    */
  var ignoreExternals: Boolean
  /**
    * The local path.
    */
  var localPath: String
  /**
    * The revision.
    */
  var revision: String
  /**
    * The server path.
    */
  var serverPath: String
}

object SvnMappingDetails {
  @scala.inline
  def apply(depth: Double, ignoreExternals: Boolean, localPath: String, revision: String, serverPath: String): SvnMappingDetails = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], ignoreExternals = ignoreExternals.asInstanceOf[js.Any], localPath = localPath.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SvnMappingDetails]
  }
}

