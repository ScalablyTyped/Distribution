package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yandexDashMapsMod {
  import typings.yandexDashMaps.yandexDashMapsMod.geometry.Point

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
  /* Rewritten from type alias, can be one of: 
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignopaque
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersigngeoObject
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignlayer
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersigntransparent
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignsilent
    - java.lang.String
  */
  type InteractivityModelKey = _InteractivityModelKey | String
  /* Rewritten from type alias, can be one of: 
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignplacemark
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignpin
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersigncircle
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignrectangle
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignpolyline
    - typings.yandexDashMaps.yandexDashMapsStrings.defaultNumbersignpolygon
    - typings.yandexDashMaps.yandexDashMapsStrings.hotspotNumbersignplacemark
    - typings.yandexDashMaps.yandexDashMapsStrings.hotspotNumbersigncircle
    - typings.yandexDashMaps.yandexDashMapsStrings.hotspotNumbersignrectangle
    - typings.yandexDashMaps.yandexDashMapsStrings.hotspotNumbersignpolyline
    - typings.yandexDashMaps.yandexDashMapsStrings.hotspotNumbersignpolygon
    - typings.yandexDashMaps.yandexDashMapsStrings.htmlNumbersignballoon
    - typings.yandexDashMaps.yandexDashMapsStrings.htmlNumbersignhint
    - typings.yandexDashMaps.yandexDashMapsStrings.htmlNumbersignplacemark
    - typings.yandexDashMaps.yandexDashMapsStrings.htmlNumbersignrectangle
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
