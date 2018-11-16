package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to define a geographic shape. */

trait IGeoshape extends js.Object {
  /** The altitude reference system of the geographic shape. */
  var altitudeReferenceSystem: AltitudeReferenceSystem
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType
  /** The spatial reference identifier for the geographic shape, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: scala.Double
}

