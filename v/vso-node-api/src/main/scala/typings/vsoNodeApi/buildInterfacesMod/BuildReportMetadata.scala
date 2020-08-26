package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildReportMetadata extends js.Object {
  /**
    * The Id of the build.
    */
  var buildId: Double = js.native
  /**
    * The content of the report.
    */
  var content: String = js.native
  /**
    * The type of the report.
    */
  var `type`: String = js.native
}

object BuildReportMetadata {
  @scala.inline
  def apply(buildId: Double, content: String, `type`: String): BuildReportMetadata = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReportMetadata]
  }
  @scala.inline
  implicit class BuildReportMetadataOps[Self <: BuildReportMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuildId(value: Double): Self = this.set("buildId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

