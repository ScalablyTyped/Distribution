package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditorChildModel extends IGeometryEditorModel {
  var editor: IGeometryEditor
  var geometry: IBaseGeometry
  def getParent(): IGeometryEditorModel
  def setPixels(pixels: js.Array[Double]): Unit
}

object IGeometryEditorChildModel {
  @scala.inline
  def apply(
    destroy: () => Unit,
    editor: IGeometryEditor,
    events: IEventManager,
    geometry: IBaseGeometry,
    getParent: () => IGeometryEditorModel,
    getPixels: () => js.Array[Double],
    setPixels: js.Array[Double] => Unit
  ): IGeometryEditorChildModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), editor = editor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], getParent = js.Any.fromFunction0(getParent), getPixels = js.Any.fromFunction0(getPixels), setPixels = js.Any.fromFunction1(setPixels))
  
    __obj.asInstanceOf[IGeometryEditorChildModel]
  }
}

