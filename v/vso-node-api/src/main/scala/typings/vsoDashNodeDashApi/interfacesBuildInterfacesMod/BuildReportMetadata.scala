package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReportMetadata extends js.Object {
  /**
    * The Id of the build.
    */
  var buildId: Double
  /**
    * The content of the report.
    */
  var content: String
  /**
    * The type of the report.
    */
  var `type`: String
}

object BuildReportMetadata {
  @scala.inline
  def apply(buildId: Double, content: String, `type`: String): BuildReportMetadata = {
    val __obj = js.Dynamic.literal(buildId = buildId, content = content)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildReportMetadata]
  }
}

