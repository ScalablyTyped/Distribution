package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.ICustomizable because var conflicts: events. Inlined options */ @JSGlobal("ymaps.control.SearchControl")
@js.native
class SearchControl ()
  extends yandexDashMapsLib.ymapsNs.IControl {
  def this(parameters: ISearchControlParameters) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  var state: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def clear(): scala.Unit = js.native
  def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getRequestString(): java.lang.String = js.native
  def getResponseMetaData(): js.Object = js.native
  def getResult(index: scala.Double): js.Promise[js.Object] = js.native
  def getResultsArray(): js.Array[js.Object] = js.native
  def getResultsCount(): scala.Double = js.native
  def getSelectedIndex(): scala.Double = js.native
  def hideResult(): scala.Unit = js.native
  def search(request: java.lang.String): js.Promise[scala.Unit] = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
  def showResult(index: scala.Double): this.type = js.native
}

