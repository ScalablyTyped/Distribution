package typings.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzerDescriptor extends js.Object {
  var description: String = js.native
  var id: String = js.native
  var majorVersion: Double = js.native
  var minorVersion: Double = js.native
  var name: String = js.native
  var patchVersion: Double = js.native
}

object AnalyzerDescriptor {
  @scala.inline
  def apply(
    description: String,
    id: String,
    majorVersion: Double,
    minorVersion: Double,
    name: String,
    patchVersion: Double
  ): AnalyzerDescriptor = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], patchVersion = patchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerDescriptor]
  }
  @scala.inline
  implicit class AnalyzerDescriptorOps[Self <: AnalyzerDescriptor] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchVersion(value: Double): Self = this.set("patchVersion", value.asInstanceOf[js.Any])
  }
  
}

