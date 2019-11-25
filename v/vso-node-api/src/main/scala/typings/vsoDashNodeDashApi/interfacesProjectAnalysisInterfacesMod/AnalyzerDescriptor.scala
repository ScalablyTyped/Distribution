package typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzerDescriptor extends js.Object {
  var description: String
  var id: String
  var majorVersion: Double
  var minorVersion: Double
  var name: String
  var patchVersion: Double
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
}

