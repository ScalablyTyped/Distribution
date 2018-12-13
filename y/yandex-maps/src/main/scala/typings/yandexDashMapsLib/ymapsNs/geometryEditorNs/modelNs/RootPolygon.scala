package typings
package yandexDashMapsLib.ymapsNs.geometryEditorNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometryEditor.model.RootPolygon")
@js.native
class RootPolygon ()
  extends yandexDashMapsLib.ymapsNs.IGeometryEditorRootModel {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  def getAllVerticesNumber(): scala.Double = js.native
  def getPathModels(): js.Array[ChildLinearRing] = js.native
  /* CompleteClass */
  override def getPixels(): js.Array[scala.Double] = js.native
  def splicePaths(start: scala.Double, deleteCount: scala.Double): js.Array[js.Array[scala.Double]] = js.native
}

