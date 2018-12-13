package typings
package yandexDashMapsLib.ymapsNs.geometryEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometryEditor.Circle")
@js.native
class Circle protected ()
  extends yandexDashMapsLib.ymapsNs.IGeometryEditor {
  def this(geometry: yandexDashMapsLib.ymapsNs.ICircleGeometry) = this()
  def this(geometry: yandexDashMapsLib.ymapsNs.ICircleGeometry, options: js.Object) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override var geometry: yandexDashMapsLib.ymapsNs.IGeometry = js.native
  /* CompleteClass */
  override var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  /* CompleteClass */
  override var state: yandexDashMapsLib.ymapsNs.IDataManager = js.native
  def startDrawing(): yandexDashMapsLib.ymapsNs.vowNs.Promise = js.native
  /* CompleteClass */
  override def startEditing(): scala.Unit = js.native
  def stopDrawing(): yandexDashMapsLib.ymapsNs.vowNs.Promise = js.native
  /* CompleteClass */
  override def stopEditing(): scala.Unit = js.native
}

