package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Location")
@js.native
class Location protected ()
  extends typings.typescriptServices.TypeScript.Location {
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Location")
@js.native
object Location extends js.Object {
  def equals(
    location1: typings.typescriptServices.TypeScript.Location,
    location2: typings.typescriptServices.TypeScript.Location
  ): Boolean = js.native
}

