package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yandexDashMapsMod {
  type IChildOnMap = IChild[IControlParent]
  type IControl = IChildOnMap
  type ICopyrightsAccessor = ICopyrightsProvider
  type IDomEventEmitter = IEventEmitter
  type IExpandableControlLayout = ILayout
  type IGeometryEditorRootModel = IGeometryEditorModel
  type IHintManager[T] = IPopupManager[T]
  type IMultiRouteReferencePoint = java.lang.String | js.Array[scala.Double] | yandexDashMapsLib.yandexDashMapsMod.geometryNs.Point
  type ISearchControlLayout = IExpandableControlLayout
  type ISelectableControlLayout = ILayout
  /* Rewritten from type alias, can be one of: 
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#opaque`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#geoObject`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#layer`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#transparent`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#silent`
    - java.lang.String
  */
  type InteractivityModelKey = _InteractivityModelKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#placemark`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#pin`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#circle`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#rectangle`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#polyline`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`default#polygon`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`hotspot#placemark`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`hotspot#circle`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`hotspot#rectangle`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`hotspot#polyline`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`hotspot#polygon`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`html#balloon`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`html#hint`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`html#placemark`
    - yandexDashMapsLib.yandexDashMapsLibStrings.`html#rectangle`
    - java.lang.String
    - IClassConstructor[IOverlay]
    - js.Function3[
  / * geometry * / IPixelLineStringGeometry, 
  / * data * / IDataManager | js.Object, 
  / * options * / js.Object, 
  js.Promise[java.lang.String | IClassConstructor[IOverlay]]]
  */
  type OverlayKey = _OverlayKey | IClassConstructor[IOverlay] | (js.Function3[
    /* geometry */ IPixelLineStringGeometry, 
    /* data */ IDataManager | js.Object, 
    /* options */ js.Object, 
    js.Promise[java.lang.String | IClassConstructor[IOverlay]]
  ]) | java.lang.String
  type PresetKey = java.lang.String
}
