package typings
package unlDashCoreLib.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unl-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def adjacent(geohash: java.lang.String, direction: java.lang.String): java.lang.String = js.native
  def adjacent(geohash: java.lang.String, direction: Direction): java.lang.String = js.native
  def appendElevation(geohashWithoutElevation: java.lang.String, elevation: scala.Double, elevationType: ElevationType): java.lang.String = js.native
  def bounds(geohash: java.lang.String): Bounds = js.native
  def decode(geohash: java.lang.String): Point = js.native
  def encode(latitude: scala.Double, longitude: scala.Double): java.lang.String = js.native
  def encode(latitude: scala.Double, longitude: scala.Double, precision: scala.Double): java.lang.String = js.native
  def encode(latitude: scala.Double, longitude: scala.Double, precision: scala.Double, options: EncodeOptions): java.lang.String = js.native
  def excludeElevation(geohashWithElevation: java.lang.String): GeohashWithElevation = js.native
  def neighbours(geohash: java.lang.String): Neighbours = js.native
}

