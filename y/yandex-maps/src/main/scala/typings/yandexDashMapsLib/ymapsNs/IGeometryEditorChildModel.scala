package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditorChildModel extends IGeometryEditorModel {
  var editor: IGeometryEditor
  var geometry: IBaseGeometry
  def getParent(): IGeometryEditorModel
  def setPixels(pixels: js.Array[scala.Double]): scala.Unit
}

object IGeometryEditorChildModel {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    editor: IGeometryEditor,
    events: IEventManager,
    geometry: IBaseGeometry,
    getParent: js.Function0[IGeometryEditorModel],
    getPixels: js.Function0[js.Array[scala.Double]],
    setPixels: js.Function1[js.Array[scala.Double], scala.Unit]
  ): IGeometryEditorChildModel = {
    val __obj = js.Dynamic.literal(destroy = destroy, editor = editor, events = events, geometry = geometry, getParent = getParent, getPixels = getPixels, setPixels = setPixels)
  
    __obj.asInstanceOf[IGeometryEditorChildModel]
  }
}

