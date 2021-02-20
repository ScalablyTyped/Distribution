package typings.viewportMercatorProject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Bounds = js.Tuple2[
    typings.viewportMercatorProject.mod.Coordinates, 
    typings.viewportMercatorProject.mod.Coordinates
  ]
  
  type Coordinates = js.Tuple2[scala.Double, scala.Double]
  
  type CoordinatesZ = js.Tuple3[scala.Double, scala.Double, scala.Double]
  
  type Padding = scala.Double | typings.viewportMercatorProject.anon.Bottom
  
  type ViewMatrix = js.Array[scala.Double]
  
  @scala.inline
  def addMetersToLngLat(
    lngLatZ: typings.viewportMercatorProject.mod.CoordinatesZ,
    xyz: typings.viewportMercatorProject.mod.CoordinatesZ
  ): typings.viewportMercatorProject.mod.CoordinatesZ = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addMetersToLngLat")(lngLatZ.asInstanceOf[js.Any], xyz.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def addMetersToLngLat(
    lngLat: typings.viewportMercatorProject.mod.Coordinates,
    xy: typings.viewportMercatorProject.mod.Coordinates
  ): typings.viewportMercatorProject.mod.Coordinates = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addMetersToLngLat")(lngLat.asInstanceOf[js.Any], xy.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.Coordinates]
  
  @scala.inline
  def fitBounds(options: typings.viewportMercatorProject.anon.Bounds): typings.viewportMercatorProject.mod.FittedBounds = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fitBounds")(options.asInstanceOf[js.Any]).asInstanceOf[typings.viewportMercatorProject.mod.FittedBounds]
  
  @scala.inline
  def flyToViewport(
    startProps: typings.viewportMercatorProject.mod.FlyToViewportProps,
    endProps: typings.viewportMercatorProject.mod.FlyToViewportProps,
    t: scala.Double
  ): typings.viewportMercatorProject.mod.TransitionViewport = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("flyToViewport")(startProps.asInstanceOf[js.Any], endProps.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.TransitionViewport]
  
  @scala.inline
  def getDistanceScales(input: typings.viewportMercatorProject.mod.DistanceScalesInput): typings.viewportMercatorProject.mod.DistanceScales = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceScales")(input.asInstanceOf[js.Any]).asInstanceOf[typings.viewportMercatorProject.mod.DistanceScales]
  @scala.inline
  def getDistanceScales(input: typings.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput): typings.viewportMercatorProject.mod.HighPrecisionDistanceScales = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceScales")(input.asInstanceOf[js.Any]).asInstanceOf[typings.viewportMercatorProject.mod.HighPrecisionDistanceScales]
  
  @scala.inline
  def getMeterZoom(input: typings.viewportMercatorProject.anon.Latitude): scala.Double = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMeterZoom")(input.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getProjectionMatrix(input: typings.viewportMercatorProject.mod.ProjectionParametersInput): typings.glMatrix.mod.mat4 = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getProjectionMatrix")(input.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.mat4]
  
  @scala.inline
  def getProjectionParameters(input: typings.viewportMercatorProject.mod.ProjectionParametersInput): typings.viewportMercatorProject.mod.ProjectionParameters = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getProjectionParameters")(input.asInstanceOf[js.Any]).asInstanceOf[typings.viewportMercatorProject.mod.ProjectionParameters]
  
  @scala.inline
  def getViewMatrix(input: typings.viewportMercatorProject.anon.Altitude): typings.viewportMercatorProject.mod.ViewMatrix = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getViewMatrix")(input.asInstanceOf[js.Any]).asInstanceOf[typings.viewportMercatorProject.mod.ViewMatrix]
  
  @scala.inline
  def lngLatToWorld(lngLat: typings.viewportMercatorProject.mod.Coordinates, scale: scala.Double): typings.viewportMercatorProject.mod.Coordinates = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lngLatToWorld")(lngLat.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.Coordinates]
  
  @scala.inline
  def normalizeViewportProps(props: typings.viewportMercatorProject.mod.ViewportProps): typings.viewportMercatorProject.mod.NormalizedViewportProps = typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeViewportProps")(props.asInstanceOf[js.Any]).asInstanceOf[typings.viewportMercatorProject.mod.NormalizedViewportProps]
  
  @scala.inline
  def pixelsToWorld(
    pixels: typings.viewportMercatorProject.mod.CoordinatesZ,
    pixelUnprojectionMatrix: typings.glMatrix.mod.mat4
  ): typings.viewportMercatorProject.mod.CoordinatesZ = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def pixelsToWorld(
    pixels: typings.viewportMercatorProject.mod.CoordinatesZ,
    pixelUnprojectionMatrix: typings.glMatrix.mod.mat4,
    targetZ: scala.Double
  ): typings.viewportMercatorProject.mod.CoordinatesZ = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any], targetZ.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def pixelsToWorld(
    pixels: typings.viewportMercatorProject.mod.Coordinates,
    pixelUnprojectionMatrix: typings.glMatrix.mod.mat4
  ): typings.viewportMercatorProject.mod.CoordinatesZ = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def pixelsToWorld(
    pixels: typings.viewportMercatorProject.mod.Coordinates,
    pixelUnprojectionMatrix: typings.glMatrix.mod.mat4,
    targetZ: scala.Double
  ): typings.viewportMercatorProject.mod.CoordinatesZ = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any], targetZ.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.CoordinatesZ]
  
  @scala.inline
  def worldToLngLat(point: typings.viewportMercatorProject.mod.Coordinates, scale: scala.Double): typings.viewportMercatorProject.mod.Coordinates = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("worldToLngLat")(point.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.Coordinates]
  
  @scala.inline
  def worldToPixels(
    coordinates: typings.viewportMercatorProject.mod.CoordinatesZ,
    pixelProjectionMatrix: typings.glMatrix.mod.mat4
  ): typings.viewportMercatorProject.mod.CoordinatesZ = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("worldToPixels")(coordinates.asInstanceOf[js.Any], pixelProjectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def worldToPixels(
    coordinates: typings.viewportMercatorProject.mod.Coordinates,
    pixelProjectionMatrix: typings.glMatrix.mod.mat4
  ): typings.viewportMercatorProject.mod.CoordinatesZ = (typings.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("worldToPixels")(coordinates.asInstanceOf[js.Any], pixelProjectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typings.viewportMercatorProject.mod.CoordinatesZ]
}
