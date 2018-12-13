package typings
package yandexDashMapsLib.ymapsNs.geometryEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.geometryEditor.LineString")
@js.native
class LineString protected ()
  extends yandexDashMapsLib.ymapsNs.IGeometryEditor {
  def this(geometry: yandexDashMapsLib.ymapsNs.ILineStringGeometry) = this()
  def this(geometry: yandexDashMapsLib.ymapsNs.ILineStringGeometry, options: js.Object) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override var geometry: yandexDashMapsLib.ymapsNs.IGeometry = js.native
  /* CompleteClass */
  override var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  /* CompleteClass */
  override var state: yandexDashMapsLib.ymapsNs.IDataManager = js.native
  def getModel(): yandexDashMapsLib.ymapsNs.vowNs.Promise = js.native
  def getModelSync(): yandexDashMapsLib.ymapsNs.geometryEditorNs.modelNs.RootLineString | scala.Null = js.native
  def getView(): yandexDashMapsLib.ymapsNs.vowNs.Promise = js.native
  def getViewSync(): yandexDashMapsLib.ymapsNs.geometryEditorNs.viewNs.Path | scala.Null = js.native
  def startDrawing(): yandexDashMapsLib.ymapsNs.vowNs.Promise = js.native
  /* CompleteClass */
  override def startEditing(): scala.Unit = js.native
  def startFraming(): yandexDashMapsLib.ymapsNs.vowNs.Promise = js.native
  def stopDrawing(): scala.Unit = js.native
  /* CompleteClass */
  override def stopEditing(): scala.Unit = js.native
  def stopFraming(): scala.Unit = js.native
}

