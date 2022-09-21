package typings.viewportMercatorProject.mod

import typings.glMatrix.mod.mat4
import typings.viewportMercatorProject.anon.Altitude
import typings.viewportMercatorProject.anon.Bottom
import typings.viewportMercatorProject.anon.Latitude
import typings.viewportMercatorProject.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addMetersToLngLat(lngLatZ: CoordinatesZ, xyz: CoordinatesZ): CoordinatesZ = (^.asInstanceOf[js.Dynamic].applyDynamic("addMetersToLngLat")(lngLatZ.asInstanceOf[js.Any], xyz.asInstanceOf[js.Any])).asInstanceOf[CoordinatesZ]
inline def addMetersToLngLat(lngLat: Coordinates, xy: Coordinates): Coordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("addMetersToLngLat")(lngLat.asInstanceOf[js.Any], xy.asInstanceOf[js.Any])).asInstanceOf[Coordinates]

inline def fitBounds(options: typings.viewportMercatorProject.anon.Bounds): FittedBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("fitBounds")(options.asInstanceOf[js.Any]).asInstanceOf[FittedBounds]

inline def flyToViewport(startProps: FlyToViewportProps, endProps: FlyToViewportProps, t: Double): TransitionViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("flyToViewport")(startProps.asInstanceOf[js.Any], endProps.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[TransitionViewport]

inline def getDistanceScales(input: DistanceScalesInput): DistanceScales = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceScales")(input.asInstanceOf[js.Any]).asInstanceOf[DistanceScales]
inline def getDistanceScales(input: HighPrecisionDistanceScalesInput): HighPrecisionDistanceScales = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceScales")(input.asInstanceOf[js.Any]).asInstanceOf[HighPrecisionDistanceScales]

inline def getMeterZoom(input: Latitude): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeterZoom")(input.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getProjectionMatrix(input: ProjectionParametersInput): mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectionMatrix")(input.asInstanceOf[js.Any]).asInstanceOf[mat4]

inline def getProjectionParameters(input: ProjectionParametersInput): ProjectionParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectionParameters")(input.asInstanceOf[js.Any]).asInstanceOf[ProjectionParameters]

inline def getViewMatrix(input: Altitude): ViewMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewMatrix")(input.asInstanceOf[js.Any]).asInstanceOf[ViewMatrix]

inline def lngLatToWorld(lngLat: Coordinates, scale: Double): Coordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("lngLatToWorld")(lngLat.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Coordinates]

inline def normalizeViewportProps(props: ViewportProps): NormalizedViewportProps = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeViewportProps")(props.asInstanceOf[js.Any]).asInstanceOf[NormalizedViewportProps]

inline def pixelsToWorld(pixels: CoordinatesZ, pixelUnprojectionMatrix: mat4): CoordinatesZ = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any])).asInstanceOf[CoordinatesZ]
inline def pixelsToWorld(pixels: CoordinatesZ, pixelUnprojectionMatrix: mat4, targetZ: Double): CoordinatesZ = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any], targetZ.asInstanceOf[js.Any])).asInstanceOf[CoordinatesZ]
inline def pixelsToWorld(pixels: Coordinates, pixelUnprojectionMatrix: mat4): CoordinatesZ = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any])).asInstanceOf[CoordinatesZ]
inline def pixelsToWorld(pixels: Coordinates, pixelUnprojectionMatrix: mat4, targetZ: Double): CoordinatesZ = (^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any], targetZ.asInstanceOf[js.Any])).asInstanceOf[CoordinatesZ]

inline def worldToLngLat(point: Coordinates, scale: Double): Coordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("worldToLngLat")(point.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Coordinates]

inline def worldToPixels(coordinates: CoordinatesZ, pixelProjectionMatrix: mat4): CoordinatesZ = (^.asInstanceOf[js.Dynamic].applyDynamic("worldToPixels")(coordinates.asInstanceOf[js.Any], pixelProjectionMatrix.asInstanceOf[js.Any])).asInstanceOf[CoordinatesZ]
inline def worldToPixels(coordinates: Coordinates, pixelProjectionMatrix: mat4): CoordinatesZ = (^.asInstanceOf[js.Dynamic].applyDynamic("worldToPixels")(coordinates.asInstanceOf[js.Any], pixelProjectionMatrix.asInstanceOf[js.Any])).asInstanceOf[CoordinatesZ]

type Bounds = js.Tuple2[Coordinates, Coordinates]

type Coordinates = js.Tuple2[Double, Double]

type CoordinatesZ = js.Tuple3[Double, Double, Double]

type Padding = Double | Bottom

type ViewMatrix = js.Array[Double]
