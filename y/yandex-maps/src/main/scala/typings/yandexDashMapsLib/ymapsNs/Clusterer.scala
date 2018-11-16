package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.ICustomizable because Would inherit conflicting mutable fields List(events))*/
@JSGlobal("ymaps.Clusterer")
@js.native
class Clusterer ()
  extends IChildOnMap
     with IParentOnMap {
  def this(options: IClustererOptions) = this()
  var balloon: yandexDashMapsLib.ymapsNs.clustererNs.Balloon = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  // 	balloonopen:
  var hint: yandexDashMapsLib.ymapsNs.clustererNs.Hint = js.native
  var options: IOptionManager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  /* InferMemberOverrides */
  override def getParent(): js.Object | scala.Null = js.native
  /* InferMemberOverrides */
  override def setParent(): this.type = js.native
  /* InferMemberOverrides */
  override def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

