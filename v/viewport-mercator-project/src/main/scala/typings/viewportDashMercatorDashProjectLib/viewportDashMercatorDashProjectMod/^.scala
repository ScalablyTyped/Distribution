package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewport-mercator-project", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addMetersToLngLat(lngLatZ: CoordinatesZ, xyz: CoordinatesZ): CoordinatesZ = js.native
  def addMetersToLngLat(lngLat: Coordinates, xy: Coordinates): Coordinates = js.native
  def fitBounds(options: viewportDashMercatorDashProjectLib.Anon_Bounds): FittedBounds = js.native
  def flyToViewport(startProps: FlyToViewportProps, endProps: FlyToViewportProps, t: scala.Double): TransitionViewport = js.native
  def getDistanceScales(input: DistanceScalesInput): DistanceScales = js.native
  def getDistanceScales(input: HighPrecisionDistanceScalesInput): HighPrecisionDistanceScales = js.native
  def getMeterZoom(input: viewportDashMercatorDashProjectLib.Anon_Latitude): scala.Double = js.native
  def getProjectionMatrix(input: ProjectionParametersInput): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def getProjectionParameters(input: ProjectionParametersInput): ProjectionParameters = js.native
  def getViewMatrix(input: viewportDashMercatorDashProjectLib.Anon_Altitude): ViewMatrix = js.native
  def lngLatToWorld(lngLat: Coordinates, scale: scala.Double): Coordinates = js.native
  def normalizeViewportProps(props: ViewportProps): NormalizedViewportProps = js.native
  def pixelsToWorld(pixels: CoordinatesZ, pixelUnprojectionMatrix: glDashMatrixLib.glDashMatrixMod.mat4): CoordinatesZ = js.native
  def pixelsToWorld(
    pixels: CoordinatesZ,
    pixelUnprojectionMatrix: glDashMatrixLib.glDashMatrixMod.mat4,
    targetZ: scala.Double
  ): CoordinatesZ = js.native
  def pixelsToWorld(pixels: Coordinates, pixelUnprojectionMatrix: glDashMatrixLib.glDashMatrixMod.mat4): CoordinatesZ = js.native
  def pixelsToWorld(
    pixels: Coordinates,
    pixelUnprojectionMatrix: glDashMatrixLib.glDashMatrixMod.mat4,
    targetZ: scala.Double
  ): CoordinatesZ = js.native
  def worldToLngLat(point: Coordinates, scale: scala.Double): Coordinates = js.native
  def worldToPixels(coordinates: CoordinatesZ, pixelProjectionMatrix: glDashMatrixLib.glDashMatrixMod.mat4): CoordinatesZ = js.native
  def worldToPixels(coordinates: Coordinates, pixelProjectionMatrix: glDashMatrixLib.glDashMatrixMod.mat4): CoordinatesZ = js.native
}

