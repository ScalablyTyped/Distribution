package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  type IChildOnMap = typings.yandexMaps.mod.IChild[typings.yandexMaps.mod.IControlParent]
  type IControl = typings.yandexMaps.mod.IChildOnMap
  type ICopyrightsAccessor = typings.yandexMaps.mod.ICopyrightsProvider
  type IDomEventEmitter = typings.yandexMaps.mod.IEventEmitter
  type IExpandableControlLayout = typings.yandexMaps.mod.ILayout
  type IGeometryEditorRootModel = typings.yandexMaps.mod.IGeometryEditorModel
  type IHintManager[T] = typings.yandexMaps.mod.IPopupManager[T]
  type IMultiRouteReferencePoint = java.lang.String | js.Array[scala.Double] | typings.yandexMaps.mod.geometry.Point
  type ISearchControlLayout = typings.yandexMaps.mod.IExpandableControlLayout
  type ISelectableControlLayout = typings.yandexMaps.mod.ILayout
  /* Rewritten from type alias, can be one of: 
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignopaque
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersigngeoObject
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignlayer
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersigntransparent
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignsilent
    - java.lang.String
  */
  type InteractivityModelKey = typings.yandexMaps.mod._InteractivityModelKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignplacemark
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignpin
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersigncircle
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignrectangle
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignpolyline
    - typings.yandexMaps.yandexMapsStrings.defaultNumbersignpolygon
    - typings.yandexMaps.yandexMapsStrings.hotspotNumbersignplacemark
    - typings.yandexMaps.yandexMapsStrings.hotspotNumbersigncircle
    - typings.yandexMaps.yandexMapsStrings.hotspotNumbersignrectangle
    - typings.yandexMaps.yandexMapsStrings.hotspotNumbersignpolyline
    - typings.yandexMaps.yandexMapsStrings.hotspotNumbersignpolygon
    - typings.yandexMaps.yandexMapsStrings.htmlNumbersignballoon
    - typings.yandexMaps.yandexMapsStrings.htmlNumbersignhint
    - typings.yandexMaps.yandexMapsStrings.htmlNumbersignplacemark
    - typings.yandexMaps.yandexMapsStrings.htmlNumbersignrectangle
    - java.lang.String
    - typings.yandexMaps.mod.IClassConstructor[typings.yandexMaps.mod.IOverlay]
    - js.Function3[
  / * geometry * / typings.yandexMaps.mod.IPixelLineStringGeometry, 
  / * data * / typings.yandexMaps.mod.IDataManager | js.Object, 
  / * options * / js.Object, 
  js.Promise[
    java.lang.String | typings.yandexMaps.mod.IClassConstructor[typings.yandexMaps.mod.IOverlay]
  ]]
  */
  type OverlayKey = typings.yandexMaps.mod._OverlayKey | typings.yandexMaps.mod.IClassConstructor[typings.yandexMaps.mod.IOverlay] | (js.Function3[
    /* geometry */ typings.yandexMaps.mod.IPixelLineStringGeometry, 
    /* data */ typings.yandexMaps.mod.IDataManager | js.Object, 
    /* options */ js.Object, 
    js.Promise[
      java.lang.String | typings.yandexMaps.mod.IClassConstructor[typings.yandexMaps.mod.IOverlay]
    ]
  ]) | java.lang.String
  type PresetKey = java.lang.String
}
