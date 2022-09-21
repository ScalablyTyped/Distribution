package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.HTMLElement
import typings.yandexMaps.mod.Clusterer_
import typings.yandexMaps.mod.Collection_
import typings.yandexMaps.mod.DomEvent_
import typings.yandexMaps.mod.Event_
import typings.yandexMaps.mod.GeoObject_
import typings.yandexMaps.mod.IBalloonOptions
import typings.yandexMaps.mod.ICircleGeometry
import typings.yandexMaps.mod.ICircleOptions
import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.IClusterPlacemarkOptions
import typings.yandexMaps.mod.IClusterPlacemarkProperties
import typings.yandexMaps.mod.IClustererOptions
import typings.yandexMaps.mod.IDataManager
import typings.yandexMaps.mod.IEvent
import typings.yandexMaps.mod.IGeoObjectFeature
import typings.yandexMaps.mod.IGeoObjectOptions
import typings.yandexMaps.mod.IGeocodeOptions
import typings.yandexMaps.mod.IGeocodeResult
import typings.yandexMaps.mod.ILineStringGeometry
import typings.yandexMaps.mod.IMapOptions
import typings.yandexMaps.mod.IMapState
import typings.yandexMaps.mod.IObjectManagerOptions
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.IPlacemarkOptions
import typings.yandexMaps.mod.IPointGeometry
import typings.yandexMaps.mod.IPolygonGeometry
import typings.yandexMaps.mod.IPolygonOptions
import typings.yandexMaps.mod.IPolylineOptions
import typings.yandexMaps.mod.IPopupOptions
import typings.yandexMaps.mod.IReadyObject
import typings.yandexMaps.mod.IShape
import typings.yandexMaps.mod.ISuggestOptions
import typings.yandexMaps.mod.ISuggestResult
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.ObjectManager_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofyandexMaps extends StObject {
  
  var Balloon: Instantiable2[
    /* map */ Map_, 
    /* options */ js.UndefOr[IBalloonOptions], 
    typings.yandexMaps.mod.Balloon
  ] = js.native
  
  var Circle: Instantiable3[
    /* geometry */ (js.Array[js.Array[js.Array[js.Array[ICircleGeometry]] | Double]]) | js.Object, 
    /* properties */ js.UndefOr[js.Object | IDataManager], 
    /* options */ js.UndefOr[ICircleOptions], 
    typings.yandexMaps.mod.Circle
  ] = js.native
  
  var ClusterPlacemark: Instantiable3[
    /* geometry */ js.Array[Double] | js.Object | IPointGeometry, 
    /* properties */ IClusterPlacemarkProperties, 
    /* options */ js.UndefOr[IClusterPlacemarkOptions], 
    typings.yandexMaps.mod.ClusterPlacemark
  ] = js.native
  
  var Clusterer: Instantiable1[/* options */ js.UndefOr[IClustererOptions], Clusterer_] = js.native
  
  var Collection: Instantiable1[/* options */ js.UndefOr[js.Object], Collection_[js.Object]] = js.native
  
  var DomEvent: Instantiable2[
    /* originalEvent */ DomEvent_[js.Object, js.Object], 
    /* type */ js.UndefOr[js.Object], 
    DomEvent_[js.Object, js.Object]
  ] = js.native
  
  var Event: Instantiable2[
    /* originalEvent */ js.Object, 
    /* sourceEvent */ IEvent[js.Object, js.Object], 
    Event_[js.Object, js.Object]
  ] = js.native
  
  var GeoObject: Instantiable2[
    /* feature */ js.UndefOr[IGeoObjectFeature], 
    /* options */ js.UndefOr[IGeoObjectOptions], 
    GeoObject_[js.Object, js.Object]
  ] = js.native
  
  var GeoObjectCollection: Instantiable2[
    /* feature */ js.UndefOr[Children], 
    /* options */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.GeoObjectCollection
  ] = js.native
  
  var GeocodeResult: Instantiable0[typings.yandexMaps.mod.GeocodeResult] = js.native
  
  var Hotspot: Instantiable2[/* shape */ IShape, /* zIndex */ js.UndefOr[Double], typings.yandexMaps.mod.Hotspot] = js.native
  
  var Layer: Instantiable1[
    /* tileUrlTemplate */ String | (js.Function2[/* tileNumber */ js.Array[Double], /* tileZoom */ Double, String]), 
    typings.yandexMaps.mod.Layer
  ] = js.native
  
  var Map: Instantiable3[
    /* parentElement */ HTMLElement | String, 
    /* state */ IMapState, 
    /* options */ js.UndefOr[IMapOptions], 
    Map_
  ] = js.native
  
  var MapEvent: Instantiable0[typings.yandexMaps.mod.MapEvent[js.Object, js.Object]] = js.native
  
  var MapType: Instantiable2[
    /* name */ String, 
    /* layers */ js.Array[IClassConstructor[typings.yandexMaps.mod.Layer] | String], 
    typings.yandexMaps.mod.MapType
  ] = js.native
  
  var Monitor: Instantiable1[/* dataManager */ IDataManager | IOptionManager, typings.yandexMaps.mod.Monitor] = js.native
  
  var ObjectManager: Instantiable1[/* options */ IObjectManagerOptions, ObjectManager_] = js.native
  
  var Placemark: Instantiable3[
    /* geometry */ js.Array[Double] | js.Object | IPointGeometry, 
    /* properties */ js.Object | IDataManager, 
    /* options */ js.UndefOr[IPlacemarkOptions], 
    typings.yandexMaps.mod.Placemark
  ] = js.native
  
  var Polygon: Instantiable3[
    /* geometry */ js.Array[js.Array[js.Array[Double]]] | js.Object | IPolygonGeometry, 
    /* properties */ js.UndefOr[js.Object | IDataManager], 
    /* options */ js.UndefOr[IPolygonOptions], 
    typings.yandexMaps.mod.Polygon
  ] = js.native
  
  var Polyline: Instantiable3[
    /* geometry */ js.Array[js.Array[Double]] | js.Object | ILineStringGeometry, 
    /* properties */ js.UndefOr[js.Object | IDataManager], 
    /* options */ js.UndefOr[IPolylineOptions], 
    typings.yandexMaps.mod.Polyline
  ] = js.native
  
  var Popup: Instantiable2[
    /* map */ Map_, 
    /* options */ js.UndefOr[IPopupOptions], 
    typings.yandexMaps.mod.Popup[js.Object]
  ] = js.native
  
  val behavior: Typeofbehavior = js.native
  
  val clusterer: Typeofclusterer = js.native
  
  val collection: Typeofcollection = js.native
  
  val control: Typeofcontrol = js.native
  
  val data: Typeofdata = js.native
  
  val domEvent: Any = js.native
  
  val event: Typeofevent = js.native
  
  val geoObject: TypeofgeoObject = js.native
  
  /**
    * Processes geocoding requests. The request result can be provided in JSON format or as a GeoObjectCollection object.
    * @param request The address for which coordinates need to be obtained (forward geocoding), or the coordinates for which the address needs to be determined (reverse geocoding).
    * @param options Options.
    */
  def geocode(request: String): js.Promise[IGeocodeResult] = js.native
  def geocode(request: String, options: IGeocodeOptions): js.Promise[IGeocodeResult] = js.native
  def geocode(request: js.Array[Double]): js.Promise[IGeocodeResult] = js.native
  def geocode(request: js.Array[Double], options: IGeocodeOptions): js.Promise[IGeocodeResult] = js.native
  
  val geometry: Typeofgeometry = js.native
  
  val geometryEditor: TypeofgeometryEditor = js.native
  
  val layout: Typeoflayout = js.native
  
  val map: Typeofmap = js.native
  
  val modules: Typeofmodules = js.native
  
  val multiRouter: TypeofmultiRouter = js.native
  
  val objectManager: TypeofobjectManager = js.native
  
  val option: Typeofoption = js.native
  
  val pane: TypeofpaneEventsPane = js.native
  
  val panorama: Typeofpanorama = js.native
  
  def ready(): js.Promise[Unit] = js.native
  def ready(successCallback: js.Function0[Any | IReadyObject]): js.Promise[Unit] = js.native
  def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: js.Function0[Any]): js.Promise[Unit] = js.native
  def ready(
    successCallback: js.Function0[Any | IReadyObject],
    errorCallback: js.Function0[Any],
    context: js.Object
  ): js.Promise[Unit] = js.native
  def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: Unit, context: js.Object): js.Promise[Unit] = js.native
  def ready(successCallback: Unit, errorCallback: js.Function0[Any]): js.Promise[Unit] = js.native
  def ready(successCallback: Unit, errorCallback: js.Function0[Any], context: js.Object): js.Promise[Unit] = js.native
  def ready(successCallback: Unit, errorCallback: Unit, context: js.Object): js.Promise[Unit] = js.native
  
  val router: Typeofrouter = js.native
  
  val shape: Typeofshape = js.native
  
  /**
    * Processes requests for search suggestions.
    * Returns a promise object that is either rejected with an error,
    * or confirmed by an array of objects in the format { displayName: "Mitishi, Moscow region", value: "Russia, Moscow region, Mitishi " }.
    * The displayName field represents the toponym in a user-friendly way,
    * and the value field represents the value which should be inserted into the search field after the user selects the suggestion.
    * @param request Request string.
    * @param options Options.
    */
  def suggest(request: String): js.Promise[js.Array[ISuggestResult]] = js.native
  def suggest(request: String, options: ISuggestOptions): js.Promise[js.Array[ISuggestResult]] = js.native
  
  val templateLayoutFactory: TypeoftemplateLayoutFacto = js.native
  
  val util: Typeofutil = js.native
  
  val vow: Typeofvow = js.native
}
