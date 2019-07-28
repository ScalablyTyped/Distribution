package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import typings.glDashMatrix.glDashMatrixMod.mat4
import typings.viewportDashMercatorDashProject.Anon_Altitude
import typings.viewportDashMercatorDashProject.Anon_Bounds
import typings.viewportDashMercatorDashProject.Anon_Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewport-mercator-project", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addMetersToLngLat(lngLatZ: CoordinatesZ, xyz: CoordinatesZ): CoordinatesZ = js.native
  def addMetersToLngLat(lngLat: Coordinates, xy: Coordinates): Coordinates = js.native
  def fitBounds(options: Anon_Bounds): FittedBounds = js.native
  def flyToViewport(startProps: FlyToViewportProps, endProps: FlyToViewportProps, t: Double): TransitionViewport = js.native
  def getDistanceScales(input: HighPrecisionDistanceScalesInput): HighPrecisionDistanceScales = js.native
  @JSName("getDistanceScales")
  def getDistanceScales_DistanceScales(input: DistanceScalesInput): DistanceScales = js.native
  def getMeterZoom(input: Anon_Latitude): Double = js.native
  def getProjectionMatrix(input: ProjectionParametersInput): mat4 = js.native
  def getProjectionParameters(input: ProjectionParametersInput): ProjectionParameters = js.native
  def getViewMatrix(input: Anon_Altitude): ViewMatrix = js.native
  def lngLatToWorld(lngLat: Coordinates, scale: Double): Coordinates = js.native
  def normalizeViewportProps(props: ViewportProps): NormalizedViewportProps = js.native
  def pixelsToWorld(pixels: CoordinatesZ, pixelUnprojectionMatrix: mat4): CoordinatesZ = js.native
  def pixelsToWorld(pixels: CoordinatesZ, pixelUnprojectionMatrix: mat4, targetZ: Double): CoordinatesZ = js.native
  def pixelsToWorld(pixels: Coordinates, pixelUnprojectionMatrix: mat4): CoordinatesZ = js.native
  def pixelsToWorld(pixels: Coordinates, pixelUnprojectionMatrix: mat4, targetZ: Double): CoordinatesZ = js.native
  def worldToLngLat(point: Coordinates, scale: Double): Coordinates = js.native
  def worldToPixels(coordinates: CoordinatesZ, pixelProjectionMatrix: mat4): CoordinatesZ = js.native
  def worldToPixels(coordinates: Coordinates, pixelProjectionMatrix: mat4): CoordinatesZ = js.native
}

