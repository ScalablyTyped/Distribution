package typings
package yandexDashMapsLib.ymapsNs.geometryEditorNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometryEditor.model.RootLineString")
@js.native
class RootLineString ()
  extends yandexDashMapsLib.ymapsNs.IGeometryEditorRootModel {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  def getAllVerticesNumber(): scala.Double = js.native
  /* CompleteClass */
  override def getPixels(): js.Array[scala.Double] = js.native
  def getVertexModels(): js.Array[ChildVertex] = js.native
  def spliceVertices(start: scala.Double, deleteCount: scala.Double): js.Array[js.Array[scala.Double]] = js.native
}

