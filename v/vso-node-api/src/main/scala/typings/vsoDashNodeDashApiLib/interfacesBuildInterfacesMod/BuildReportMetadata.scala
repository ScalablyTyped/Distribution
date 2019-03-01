package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReportMetadata extends js.Object {
  /**
    * The Id of the build.
    */
  var buildId: scala.Double
  /**
    * The content of the report.
    */
  var content: java.lang.String
  /**
    * The type of the report.
    */
  var `type`: java.lang.String
}

object BuildReportMetadata {
  @scala.inline
  def apply(buildId: scala.Double, content: java.lang.String, `type`: java.lang.String): BuildReportMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("buildId")(buildId)
    __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[BuildReportMetadata]
  }
}

