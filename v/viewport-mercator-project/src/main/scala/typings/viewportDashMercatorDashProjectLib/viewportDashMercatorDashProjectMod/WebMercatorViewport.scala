package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewport-mercator-project", "WebMercatorViewport")
@js.native
class WebMercatorViewport () extends Viewport {
  def this(opts: WebMercatorViewportOptions) = this()
  var altitude: scala.Double = js.native
  var bearing: scala.Double = js.native
  var center: CoordinatesZ = js.native
  var latitude: scala.Double = js.native
  var longitude: scala.Double = js.native
  var pitch: scala.Double = js.native
  var zoom: scala.Double = js.native
  def fitBounds(bounds: Bounds): WebMercatorViewport = js.native
  def fitBounds(bounds: Bounds, opts: viewportDashMercatorDashProjectLib.Anon_Offset): WebMercatorViewport = js.native
  def getMapCenterByLngLatPosition(opts: viewportDashMercatorDashProjectLib.Anon_LngLat): Coordinates = js.native
  def projectFlat(lngLat: Coordinates): Coordinates = js.native
  def projectFlat(lngLat: Coordinates, scale: scala.Double): Coordinates = js.native
  def unprojectFlat(xy: Coordinates): Coordinates = js.native
  def unprojectFlat(xy: Coordinates, scale: scala.Double): Coordinates = js.native
}

