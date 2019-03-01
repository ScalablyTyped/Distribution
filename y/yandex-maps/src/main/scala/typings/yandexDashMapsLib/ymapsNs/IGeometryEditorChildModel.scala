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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("geometry")(geometry)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPixels")(getPixels)
    __obj.updateDynamic("setPixels")(setPixels)
    __obj.asInstanceOf[IGeometryEditorChildModel]
  }
}

