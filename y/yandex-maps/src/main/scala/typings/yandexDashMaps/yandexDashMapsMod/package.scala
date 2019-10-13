package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yandexDashMapsMod {
  import typings.yandexDashMaps.yandexDashMapsMod.geometry.Point

  type IChildOnMap = IChild[IControlParent]
  type IControl = IChild[IControlParent]
  type ICopyrightsAccessor = ICopyrightsProvider
  type IDomEventEmitter = IEventEmitter
  type IExpandableControlLayout = ILayout
  type IGeometryEditorRootModel = IGeometryEditorModel
  type IHintManager[T] = IPopupManager[T]
  type IMultiRouteReferencePoint = String | js.Array[Double] | Point
  type ISearchControlLayout = ILayout
  type ISelectableControlLayout = ILayout
  /* Rewritten from type alias, can be one of: 
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#opaque`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#geoObject`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#layer`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#transparent`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#silent`
    - java.lang.String
  */
  type InteractivityModelKey = _InteractivityModelKey | String
  /* Rewritten from type alias, can be one of: 
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#placemark`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#pin`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#circle`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#rectangle`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#polyline`
    - typings.yandexDashMaps.yandexDashMapsStrings.`default#polygon`
    - typings.yandexDashMaps.yandexDashMapsStrings.`hotspot#placemark`
    - typings.yandexDashMaps.yandexDashMapsStrings.`hotspot#circle`
    - typings.yandexDashMaps.yandexDashMapsStrings.`hotspot#rectangle`
    - typings.yandexDashMaps.yandexDashMapsStrings.`hotspot#polyline`
    - typings.yandexDashMaps.yandexDashMapsStrings.`hotspot#polygon`
    - typings.yandexDashMaps.yandexDashMapsStrings.`html#balloon`
    - typings.yandexDashMaps.yandexDashMapsStrings.`html#hint`
    - typings.yandexDashMaps.yandexDashMapsStrings.`html#placemark`
    - typings.yandexDashMaps.yandexDashMapsStrings.`html#rectangle`
    - java.lang.String
    - typings.yandexDashMaps.yandexDashMapsMod.IClassConstructor[typings.yandexDashMaps.yandexDashMapsMod.IOverlay]
    - js.Function3[
  / * geometry * / typings.yandexDashMaps.yandexDashMapsMod.IPixelLineStringGeometry, 
  / * data * / typings.yandexDashMaps.yandexDashMapsMod.IDataManager | js.Object, 
  / * options * / js.Object, 
  js.Promise[
    java.lang.String | typings.yandexDashMaps.yandexDashMapsMod.IClassConstructor[typings.yandexDashMaps.yandexDashMapsMod.IOverlay]
  ]]
  */
  type OverlayKey = _OverlayKey | IClassConstructor[IOverlay] | (js.Function3[
    /* geometry */ IPixelLineStringGeometry, 
    /* data */ IDataManager | js.Object, 
    /* options */ js.Object, 
    js.Promise[String | IClassConstructor[IOverlay]]
  ]) | String
  type PresetKey = String
}
