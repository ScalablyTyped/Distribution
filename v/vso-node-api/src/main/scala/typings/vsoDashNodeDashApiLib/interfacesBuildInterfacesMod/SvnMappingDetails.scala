package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvnMappingDetails extends js.Object {
  /**
    * The depth.
    */
  var depth: scala.Double
  /**
    * Indicates whether to ignore externals.
    */
  var ignoreExternals: scala.Boolean
  /**
    * The local path.
    */
  var localPath: java.lang.String
  /**
    * The revision.
    */
  var revision: java.lang.String
  /**
    * The server path.
    */
  var serverPath: java.lang.String
}

object SvnMappingDetails {
  @scala.inline
  def apply(
    depth: scala.Double,
    ignoreExternals: scala.Boolean,
    localPath: java.lang.String,
    revision: java.lang.String,
    serverPath: java.lang.String
  ): SvnMappingDetails = {
    val __obj = js.Dynamic.literal(depth = depth, ignoreExternals = ignoreExternals, localPath = localPath, revision = revision, serverPath = serverPath)
  
    __obj.asInstanceOf[SvnMappingDetails]
  }
}

