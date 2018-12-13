package typings
package yandexDashMapsLib.ymapsNs.geometryEditorNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometryEditor.model.ChildVertex")
@js.native
class ChildVertex ()
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
  def getIndex(): scala.Double = js.native
  def getNextVertex(): ChildVertex | scala.Null = js.native
  /* CompleteClass */
  override def getParent(): yandexDashMapsLib.ymapsNs.IGeometryEditorModel = js.native
  /* CompleteClass */
  override def getPixels(): js.Array[scala.Double] = js.native
  def getPrevVertex(): ChildVertex | scala.Null = js.native
  def setGlobalPixels(pixels: js.Array[scala.Double]): scala.Unit = js.native
  def setIndex(index: scala.Double): scala.Unit = js.native
  def setNextVertex(nextVertex: ChildVertex): scala.Unit = js.native
  /* CompleteClass */
  override def setPixels(pixels: js.Array[scala.Double]): scala.Unit = js.native
  def setPrevVertex(prevVertex: ChildVertex): scala.Unit = js.native
}

