package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewport-mercator-project", JSImport.Namespace)
@js.native
object viewportDashMercatorDashProjectModMembers extends js.Object {
  def fitBounds(options: viewportDashMercatorDashProjectLib.Anon_Bounds): FittedBounds = js.native
  def flyToViewport(startProps: BaseViewportProps, endProps: BaseViewportProps, t: scala.Double): BaseViewportProps = js.native
  def getDistanceScales(input: DistanceScalesInput): DistanceScales = js.native
  def getDistanceScales(input: HighPrecisionDistanceScalesInput): HighPrecisionDistanceScales = js.native
  def getMeterZoom(input: viewportDashMercatorDashProjectLib.Anon_Latitude): scala.Double = js.native
  def getProjectionMatrix(input: ProjectionParametersInput): ProjectionMatrix = js.native
  def getProjectionParameters(input: ProjectionParametersInput): ProjectionParameters = js.native
  def getViewMatrix(input: viewportDashMercatorDashProjectLib.Anon_Altitude): ViewMatrix = js.native
  def getWorldPosition(input: viewportDashMercatorDashProjectLib.Anon_DistanceScales): Vector3 = js.native
  def lngLatToWorld(lngLat: Coordinates, scale: scala.Double): Coordinates = js.native
  def normalizeViewportProps(props: ViewportProps): NormalizedViewportProps = js.native
  def pixelsToWorld(pixels: CoordinatesZ, pixelUnprojectionMatrix: ProjectionMatrix): CoordinatesZ = js.native
  def pixelsToWorld(pixels: CoordinatesZ, pixelUnprojectionMatrix: ProjectionMatrix, targetZ: scala.Double): CoordinatesZ = js.native
  def pixelsToWorld(pixels: Coordinates, pixelUnprojectionMatrix: ProjectionMatrix): CoordinatesZ = js.native
  def pixelsToWorld(pixels: Coordinates, pixelUnprojectionMatrix: ProjectionMatrix, targetZ: scala.Double): CoordinatesZ = js.native
  def worldToLngLat(point: Coordinates, scale: scala.Double): Coordinates = js.native
  def worldToPixels(coordinates: CoordinatesZ, pixelProjectionMatrix: ProjectionMatrix): CoordinatesZ = js.native
  def worldToPixels(coordinates: Coordinates, pixelProjectionMatrix: ProjectionMatrix): CoordinatesZ = js.native
}

