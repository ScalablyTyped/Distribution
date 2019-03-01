package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzerDescriptor extends js.Object {
  var description: java.lang.String
  var id: java.lang.String
  var majorVersion: scala.Double
  var minorVersion: scala.Double
  var name: java.lang.String
  var patchVersion: scala.Double
}

object AnalyzerDescriptor {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    majorVersion: scala.Double,
    minorVersion: scala.Double,
    name: java.lang.String,
    patchVersion: scala.Double
  ): AnalyzerDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("majorVersion")(majorVersion)
    __obj.updateDynamic("minorVersion")(minorVersion)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("patchVersion")(patchVersion)
    __obj.asInstanceOf[AnalyzerDescriptor]
  }
}

