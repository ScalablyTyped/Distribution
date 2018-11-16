package typings
package yandexDashMapsLib.ymapsNs.mapNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line no-shadowed-variable
@JSGlobal("ymaps.map.behavior.Manager")
@js.native
class Manager protected ()
  extends yandexDashMapsLib.ymapsNs.ICustomizable
     with yandexDashMapsLib.ymapsNs.IParentOnMap {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  def this(map: yandexDashMapsLib.ymapsNs.Map, behaviors: js.Array[java.lang.String | js.Array[java.lang.String]]) = this()
  def this(map: yandexDashMapsLib.ymapsNs.Map, behaviors: js.Array[java.lang.String | js.Array[java.lang.String]], options: js.Object) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  def disable(behaviors: java.lang.String): this.type = js.native
  def disable(behaviors: js.Array[java.lang.String | js.Array[java.lang.String]]): this.type = js.native
  def enable(behaviors: java.lang.String): this.type = js.native
  def enable(behaviors: js.Array[java.lang.String | js.Array[java.lang.String]]): this.type = js.native
  def get(behaviorName: java.lang.String): yandexDashMapsLib.ymapsNs.IBehavior = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def isEnabled(behaviorName: java.lang.String): scala.Boolean = js.native
}

