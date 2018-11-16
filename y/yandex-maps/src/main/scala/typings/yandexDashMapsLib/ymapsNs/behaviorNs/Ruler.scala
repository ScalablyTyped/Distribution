package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.behavior.Ruler")
@js.native
class Ruler ()
  extends yandexDashMapsLib.ymapsNs.IBehavior {
  def this(options: IRulerOptions) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  def close(): scala.Boolean = js.native
  def getState(): java.lang.String = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
  def setState(): scala.Unit = js.native
  def setState(state: java.lang.String): scala.Unit = js.native
}

