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

