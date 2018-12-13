package typings
package yandexDashMapsLib.ymapsNs.geometryEditorNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometryEditor.model.ChildLineString")
@js.native
class ChildLineString ()
  extends yandexDashMapsLib.ymapsNs.IGeometryEditorChildModel {
  /* CompleteClass */
  override var editor: yandexDashMapsLib.ymapsNs.IGeometryEditor = js.native
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override var geometry: yandexDashMapsLib.ymapsNs.IBaseGeometry = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  def getAllVerticesNumber(): scala.Double = js.native
  def getEdgeModels(): js.Array[Edge] = js.native
  def getIndex(): scala.Double = js.native
  /* CompleteClass */
  override def getParent(): yandexDashMapsLib.ymapsNs.IGeometryEditorModel = js.native
  /* CompleteClass */
  override def getPixels(): js.Array[scala.Double] = js.native
  def getVertexModels(): js.Array[ChildVertex] = js.native
  def setIndex(index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setPixels(pixels: js.Array[scala.Double]): scala.Unit = js.native
  def spliceVertices(start: scala.Double, deleteCount: scala.Double): js.Array[js.Array[scala.Double]] = js.native
}

