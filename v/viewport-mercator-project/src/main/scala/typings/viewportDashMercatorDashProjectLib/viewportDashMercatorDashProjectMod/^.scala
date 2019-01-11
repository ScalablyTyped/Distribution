package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewport-mercator-project", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fitBounds(options: viewportDashMercatorDashProjectLib.Anon_Bounds): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.FittedBounds = js.native
  def flyToViewport(
    startProps: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.BaseViewportProps,
    endProps: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.BaseViewportProps,
    t: scala.Double
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.BaseViewportProps = js.native
  def getDistanceScales(input: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.DistanceScalesInput): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.DistanceScales = js.native
  def getDistanceScales(
    input: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.HighPrecisionDistanceScalesInput
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.HighPrecisionDistanceScales = js.native
  def getMeterZoom(input: viewportDashMercatorDashProjectLib.Anon_Latitude): scala.Double = js.native
  def getProjectionMatrix(
    input: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionParametersInput
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionMatrix = js.native
  def getProjectionParameters(
    input: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionParametersInput
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionParameters = js.native
  def getViewMatrix(input: viewportDashMercatorDashProjectLib.Anon_Altitude): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ViewMatrix = js.native
  def getWorldPosition(input: viewportDashMercatorDashProjectLib.Anon_DistanceScales): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Vector3 = js.native
  def lngLatToWorld(
    lngLat: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates,
    scale: scala.Double
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates = js.native
  def normalizeViewportProps(props: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ViewportProps): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.NormalizedViewportProps = js.native
  def pixelsToWorld(
    pixels: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ,
    pixelUnprojectionMatrix: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionMatrix
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ = js.native
  def pixelsToWorld(
    pixels: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ,
    pixelUnprojectionMatrix: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionMatrix,
    targetZ: scala.Double
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ = js.native
  def pixelsToWorld(
    pixels: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates,
    pixelUnprojectionMatrix: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionMatrix
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ = js.native
  def pixelsToWorld(
    pixels: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates,
    pixelUnprojectionMatrix: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionMatrix,
    targetZ: scala.Double
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ = js.native
  def worldToLngLat(
    point: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates,
    scale: scala.Double
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates = js.native
  def worldToPixels(
    coordinates: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ,
    pixelProjectionMatrix: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionMatrix
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ = js.native
  def worldToPixels(
    coordinates: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates,
    pixelProjectionMatrix: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.ProjectionMatrix
  ): viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ = js.native
}

