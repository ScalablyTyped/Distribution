package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Location")
@js.native
class Location protected ()
  extends typings.typescriptDashServices.TypeScriptNs.Location {
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScriptNs.LineMap,
    start: Double,
    length: Double
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Location")
@js.native
object Location extends js.Object {
  def equals(
    location1: typings.typescriptDashServices.TypeScriptNs.Location,
    location2: typings.typescriptDashServices.TypeScriptNs.Location
  ): Boolean = js.native
}

