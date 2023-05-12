package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.trimblemapsTrimblemapsJs.anon.FailIfMajorPerformanceCaveat
import typings.trimblemapsTrimblemapsJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def APIKey: String = ^.asInstanceOf[js.Dynamic].selectDynamic("APIKey").asInstanceOf[String]
inline def APIKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APIKey")(x.asInstanceOf[js.Any])

inline def APIToken: String = ^.asInstanceOf[js.Dynamic].selectDynamic("APIToken").asInstanceOf[String]
inline def APIToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APIToken")(x.asInstanceOf[js.Any])

inline def baseApiUrl: String = ^.asInstanceOf[js.Dynamic].selectDynamic("baseApiUrl").asInstanceOf[String]
inline def baseApiUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(x.asInstanceOf[js.Any])

inline def clearPrewarmedResources(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[Unit]

inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
inline def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getRTLTextPluginStatus(): PluginStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[PluginStatus]

/**
  * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
  * 16 by default.
  */
inline def maxParallelImageRequests: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("maxParallelImageRequests").asInstanceOf[Double]
inline def maxParallelImageRequests_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])

inline def prewarm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[Unit]

inline def setAPIKey(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAPIKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setAPIToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAPIToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit], deferred: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]
inline def supported(options: FailIfMajorPerformanceCaveat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

// export function setAPIKey(value: string): void;
/**
  * Number of web workers instantiated on a page with GL JS maps.
  * By default, it is set to half the number of CPU cores (capped at 6).
  */
inline def workerCount: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("workerCount").asInstanceOf[Double]
inline def workerCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])

/* Rewritten from type alias, can be one of: 
  - typings.trimblemapsTrimblemapsJs.mod.BackgroundLayout
  - typings.trimblemapsTrimblemapsJs.mod.FillLayout
  - typings.trimblemapsTrimblemapsJs.mod.FillExtrusionLayout
  - typings.trimblemapsTrimblemapsJs.mod.LineLayout
  - typings.trimblemapsTrimblemapsJs.mod.SymbolLayout
  - typings.trimblemapsTrimblemapsJs.mod.RasterLayout
  - typings.trimblemapsTrimblemapsJs.mod.CircleLayout
  - typings.trimblemapsTrimblemapsJs.mod.HeatmapLayout
  - typings.trimblemapsTrimblemapsJs.mod.HillshadeLayout
*/
type AnyLayout = _AnyLayout | BackgroundLayout | FillExtrusionLayout | RasterLayout | HeatmapLayout | HillshadeLayout

type BackgroundLayout = Layout

type Callback[Type] = js.Function2[/* error */ js.Error, /* result */ Type, Unit]

type EventData = StringDictionary[Any]

type Expression = Array[ExpressionName | Any]

type FillExtrusionLayout = Layout

type HeatmapLayout = Layout

type HillshadeLayout = Layout

/* Rewritten from type alias, can be one of: 
  - typings.trimblemapsTrimblemapsJs.mod.LngLatBounds
  - js.Tuple2[
typings.trimblemapsTrimblemapsJs.mod.LngLatLike, 
typings.trimblemapsTrimblemapsJs.mod.LngLatLike]
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - typings.trimblemapsTrimblemapsJs.mod.LngLatLike
*/
type LngLatBoundsLike = _LngLatBoundsLike | (js.Tuple2[Double | LngLatLike, Double | LngLatLike]) | (js.Tuple4[Double, Double, Double, Double])

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[scala.Double, scala.Double]
  - typings.trimblemapsTrimblemapsJs.mod.LngLat
  - typings.trimblemapsTrimblemapsJs.anon.Lat
  - typings.trimblemapsTrimblemapsJs.anon.Lon
*/
type LngLatLike = _LngLatLike | (js.Tuple2[Double, Double])

type PointLike = Point | (js.Tuple2[Double, Double])

type PromoteIdSpecification = StringDictionary[String] | String

type RasterLayout = Layout

type Sources = StringDictionary[AnySourceData]

type TransformRequestFunction = js.Function2[/* url */ String, /* resourceType */ ResourceType, RequestParameters]
