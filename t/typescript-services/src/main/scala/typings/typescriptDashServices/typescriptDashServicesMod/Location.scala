package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Location")
@js.native
class Location protected ()
  extends typings.typescriptDashServices.TypeScript.Location {
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScript.LineMap,
    start: Double,
    length: Double
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Location")
@js.native
object Location extends js.Object {
  def equals(
    location1: typings.typescriptDashServices.TypeScript.Location,
    location2: typings.typescriptDashServices.TypeScript.Location
  ): Boolean = js.native
}

