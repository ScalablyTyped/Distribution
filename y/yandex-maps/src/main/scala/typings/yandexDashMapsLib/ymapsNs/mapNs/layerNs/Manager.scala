package typings
package yandexDashMapsLib.ymapsNs.mapNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.ILayer because var conflicts: events, options. Inlined getBrightness, getCopyrights, getZoomRange */ @JSGlobal("ymaps.map.layer.Manager")
@js.native
class Manager protected ()
  extends yandexDashMapsLib.ymapsNs.IMapObjectCollection {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  def this(map: yandexDashMapsLib.ymapsNs.Map, options: yandexDashMapsLib.Anon_TrafficImageZIndex) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var getBrightness: js.UndefOr[js.Function0[scala.Double]] = js.native
  var getCopyrights: js.UndefOr[
    js.Function2[
      /* coords */ js.Array[scala.Double], 
      /* zoom */ scala.Double, 
      js.Promise[js.Array[java.lang.String | stdLib.HTMLElement]]
    ]
  ] = js.native
  var getZoomRange: js.UndefOr[
    js.Function1[/* point */ js.Array[scala.Double], js.Promise[js.Array[scala.Double]]]
  ] = js.native
  /* CompleteClass */
  override var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  /* CompleteClass */
  override def add(`object`: js.Object): this.type = js.native
  /* CompleteClass */
  override def getIterator(): yandexDashMapsLib.ymapsNs.IIterator = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getParent(): scala.Null | yandexDashMapsLib.ymapsNs.IControlParent = js.native
  /* CompleteClass */
  override def remove(`object`: js.Object): this.type = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

