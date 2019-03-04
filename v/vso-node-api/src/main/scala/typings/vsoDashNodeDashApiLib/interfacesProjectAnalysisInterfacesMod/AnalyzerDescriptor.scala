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
    val __obj = js.Dynamic.literal(description = description, id = id, majorVersion = majorVersion, minorVersion = minorVersion, name = name, patchVersion = patchVersion)
  
    __obj.asInstanceOf[AnalyzerDescriptor]
  }
}

