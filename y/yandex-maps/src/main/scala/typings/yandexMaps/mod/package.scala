package typings.yandexMaps.mod

import typings.std.GlobalEventHandlersEventMap
import typings.yandexMaps.mod.^
import typings.yandexMaps.mod.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Processes geocoding requests. The request result can be provided in JSON format or as a GeoObjectCollection object.
  * @param request The address for which coordinates need to be obtained (forward geocoding), or the coordinates for which the address needs to be determined (reverse geocoding).
  * @param options Options.
  */
inline def geocode(request: String): js.Promise[IGeocodeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: String, options: IGeocodeOptions): js.Promise[IGeocodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: js.Array[Double]): js.Promise[IGeocodeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: js.Array[Double], options: IGeocodeOptions): js.Promise[IGeocodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IGeocodeResult]]

inline def ready(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: js.Function0[Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(
  successCallback: js.Function0[Any | IReadyObject],
  errorCallback: js.Function0[Any],
  context: js.Object
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: Unit, context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: js.Function0[Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: js.Function0[Any], context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: Unit, context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

/**
  * Processes requests for search suggestions.
  * Returns a promise object that is either rejected with an error,
  * or confirmed by an array of objects in the format { displayName: "Mitishi, Moscow region", value: "Russia, Moscow region, Mitishi " }.
  * The displayName field represents the toponym in a user-friendly way,
  * and the value field represents the value which should be inserted into the search field after the user selects the suggestion.
  * @param request Request string.
  * @param options Options.
  */
inline def suggest(request: String): js.Promise[js.Array[ISuggestResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ISuggestResult]]]
inline def suggest(request: String, options: ISuggestOptions): js.Promise[js.Array[ISuggestResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ISuggestResult]]]

type ClusterContentLayoutKey = "cluster#balloonTwoColumnsItemContent" | "cluster#balloonCarouselItemContent" | "cluster#balloonAccordionItemContent" | String

type ClusterLayoutKey = "cluster#balloonTwoColumns" | "cluster#balloonCarousel" | "cluster#balloonAccordion" | String

type ControlKey = "fullscreenControl" | "geolocationControl" | "routeEditor" | "rulerControl" | "searchControl" | "trafficControl" | "typeSelector" | "zoomControl" | "smallMapDefaultSet" | "mediumMapDefaultSet" | "largeMapDefaultSet" | "default"

type ControlSetKey = "smallMapDefaultSet" | "mediumMapDefaultSet" | "largeMapDefaultSet" | "default"

type ControlSingleKey = "fullscreenControl" | "geolocationControl" | "routeEditor" | "rulerControl" | "searchControl" | "trafficControl" | "typeSelector" | "zoomControl"

type EventMap = GlobalEventHandlersEventMap

type IChildOnMap = IChild[IControlParent]

type IControl = IChildOnMap

type ICopyrightsAccessor = ICopyrightsProvider

type IDomEventEmitter = IEventEmitter

type IExpandableControlLayout = ILayout

type IGeometryEditorRootModel = IGeometryEditorModel

type IHintManager[T] = IPopupManager[T]

type IMultiRouteReferencePoint = String | js.Array[Double] | Point

type ISearchControlLayout = IExpandableControlLayout

type ISelectableControlLayout = ILayout

//option.presetStorage
//[number, number]
//[[number, number], [number, number]]
type IconLayoutKey = "default#image" | "default#imageWithContent" | String

type InteractivityModelKey = "default#opaque" | "default#geoObject" | "default#layer" | "default#transparent" | "default#silent" | String

type OverlayKey = "default#placemark" | "default#pin" | "default#circle" | "default#rectangle" | "default#polyline" | "default#polygon" | "hotspot#placemark" | "hotspot#circle" | "hotspot#rectangle" | "hotspot#polyline" | "hotspot#polygon" | "html#balloon" | "html#hint" | "html#placemark" | "html#rectangle" | String | IClassConstructor[IOverlay] | (js.Function3[
/* geometry */ IPixelLineStringGeometry, 
/* data */ IDataManager | js.Object, 
/* options */ js.Object, 
js.Promise[String | IClassConstructor[IOverlay]]])

type PresetCircleDotKey = "islands#blueCircleDotIcon" | "islands#darkGreenCircleDotIcon" | "islands#redCircleDotIcon" | "islands#violetCircleDotIcon" | "islands#darkOrangeCircleDotIcon" | "islands#blackCircleDotIcon" | "islands#nightCircleDotIcon" | "islands#yellowCircleDotIcon" | "islands#darkBlueCircleDotIcon" | "islands#greenCircleDotIcon" | "islands#pinkCircleDotIcon" | "islands#orangeCircleDotIcon" | "islands#grayCircleDotIcon" | "islands#lightBlueCircleDotIcon" | "islands#brownCircleDotIcon" | "islands#oliveCircleDotIcon"

type PresetCircleKey = "islands#blueCircleIcon" | "islands#darkGreenCircleIcon" | "islands#redCircleIcon" | "islands#violetCircleIcon" | "islands#darkOrangeCircleIcon" | "islands#blackCircleIcon" | "islands#nightCircleIcon" | "islands#yellowCircleIcon" | "islands#darkBlueCircleIcon" | "islands#greenCircleIcon" | "islands#pinkCircleIcon" | "islands#orangeCircleIcon" | "islands#grayCircleIcon" | "islands#lightBlueCircleIcon" | "islands#brownCircleIcon" | "islands#oliveCircleIcon"

type PresetClusterKey = "islands#blueClusterIcons" | "islands#invertedBlueClusterIcons" | "islands#redClusterIcons" | "islands#invertedRedClusterIcons" | "islands#darkOrangeClusterIcons" | "islands#invertedDarkOrangeClusterIcons" | "islands#nightClusterIcons" | "islands#invertedNightClusterIcons" | "islands#darkBlueClusterIcons" | "islands#invertedDarkBlueClusterIcons" | "islands#pinkClusterIcons" | "islands#invertedPinkClusterIcons" | "islands#grayClusterIcons" | "islands#invertedGrayClusterIcons" | "islands#brownClusterIcons" | "islands#invertedBrownClusterIcons" | "islands#darkGreenClusterIcons" | "islands#invertedDarkGreenClusterIcons" | "islands#violetClusterIcons" | "islands#invertedVioletClusterIcons" | "islands#blackClusterIcons" | "islands#invertedBlackClusterIcons" | "islands#yellowClusterIcons" | "islands#invertedYellowClusterIcons" | "islands#greenClusterIcons" | "islands#invertedGreenClusterIcons" | "islands#orangeClusterIcons" | "islands#invertedOrangeClusterIcons" | "islands#lightBlueClusterIcons" | "islands#invertedLightBlueClusterIcons" | "islands#oliveClusterIcons" | "islands#invertedOliveClusterIcons"

type PresetDotKey = "islands#blueDotIcon" | "islands#darkGreenDotIcon" | "islands#redDotIcon" | "islands#violetDotIcon" | "islands#darkOrangeDotIcon" | "islands#blackDotIcon" | "islands#nightDotIcon" | "islands#yellowDotIcon" | "islands#darkBlueDotIcon" | "islands#greenDotIcon" | "islands#pinkDotIcon" | "islands#orangeDotIcon" | "islands#grayDotIcon" | "islands#lightBlueDotIcon" | "islands#brownDotIcon" | "islands#oliveDotIcon"

type PresetKey = PresetWithTextKey | PresetWithTextStretchyKey | PresetDotKey | PresetCircleKey | PresetCircleDotKey | PresetWithIconKey | PresetWithIconCircleKey | PresetPictogramKey | PresetClusterKey | String

type PresetPictogramKey = "islands#geolocationIcon"

type PresetWithIconCircleKey = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 64, starting with "islands#blueHomeCircleIcon", "islands#blueScienceCircleIcon", "islands#blueAirportCircleIcon" */ String

type PresetWithIconKey = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 64, starting with "islands#blueAirportIcon", "islands#blueAttentionIcon", "islands#blueAutoIcon" */ String

type PresetWithTextKey = "islands#blueIcon" | "islands#darkGreenIcon" | "islands#redIcon" | "islands#violetIcon" | "islands#darkOrangeIcon" | "islands#blackIcon" | "islands#nightIcon" | "islands#yellowIcon" | "islands#darkBlueIcon" | "islands#greenIcon" | "islands#pinkIcon" | "islands#orangeIcon" | "islands#grayIcon" | "islands#lightBlueIcon" | "islands#brownIcon" | "islands#oliveIcon"

type PresetWithTextStretchyKey = "islands#blueStretchyIcon" | "islands#darkGreenStretchyIcon" | "islands#redStretchyIcon" | "islands#violetStretchyIcon" | "islands#darkOrangeStretchyIcon" | "islands#blackStretchyIcon" | "islands#nightStretchyIcon" | "islands#yellowStretchyIcon" | "islands#darkBlueStretchyIcon" | "islands#greenStretchyIcon" | "islands#pinkStretchyIcon" | "islands#orangeStretchyIcon" | "islands#grayStretchyIcon" | "islands#lightBlueStretchyIcon" | "islands#brownStretchyIcon" | "islands#oliveStretchyIcon"
