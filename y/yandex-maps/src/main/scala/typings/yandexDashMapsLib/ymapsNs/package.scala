package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ymapsNs {
  type IChildOnMap = IChild[IControlParent]
  type IControl = IChildOnMap
  type ICopyrightsAccessor = ICopyrightsProvider
  type IDomEventEmitter = IEventEmitter
  type IExpandableControlLayout = ILayout
  type IGeometryEditorRootModel = IGeometryEditorModel
  type IHintManager[T] = IPopupManager[T]
  type IMultiRouteReferencePoint = java.lang.String | js.Array[scala.Double] | yandexDashMapsLib.ymapsNs.geometryNs.Point
  type ISearchControlLayout = IExpandableControlLayout
  type ISelectableControlLayout = ILayout
  type InteractivityModelKey = _InteractivityModelKey | java.lang.String
  type OverlayKey = _OverlayKey | IClassConstructor[IOverlay] | (js.Function3[
    /* geometry */ IPixelLineStringGeometry, 
    /* data */ IDataManager | js.Object, 
    /* options */ js.Object, 
    js.Promise[java.lang.String | IClassConstructor[IOverlay]]
  ]) | java.lang.String
  type PresetKey = java.lang.String
}
