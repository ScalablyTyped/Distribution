package typings
package yandexDashMapsLib.ymapsNs.geometryEditorNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometryEditor.model.Edge")
@js.native
class Edge ()
  extends yandexDashMapsLib.ymapsNs.IGeometryEditorRootModel {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  def getNextVertex(): ChildVertex | scala.Null = js.native
  /* CompleteClass */
  override def getPixels(): js.Array[scala.Double] = js.native
  def getPrevVertex(): ChildVertex | scala.Null = js.native
  def setNextVertex(nextVertex: ChildVertex): scala.Unit = js.native
  def setPrevVertex(prevVertex: ChildVertex): scala.Unit = js.native
}

