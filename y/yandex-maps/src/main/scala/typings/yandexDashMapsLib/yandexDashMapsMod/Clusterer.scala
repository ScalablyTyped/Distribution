package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "Clusterer")
@js.native
class Clusterer ()
  extends IChildOnMap
     with IParentOnMap {
  def this(options: IClustererOptions) = this()
  var balloon: yandexDashMapsLib.yandexDashMapsMod.clustererNs.Balloon = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  // 	balloonopen:
  var hint: yandexDashMapsLib.yandexDashMapsMod.clustererNs.Hint = js.native
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

