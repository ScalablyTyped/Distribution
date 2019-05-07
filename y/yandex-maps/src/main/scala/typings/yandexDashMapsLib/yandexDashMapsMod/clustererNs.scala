package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "clusterer")
@js.native
object clustererNs extends js.Object {
  @js.native
  class Balloon protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBalloonManager[yandexDashMapsLib.yandexDashMapsMod.Clusterer] {
    //tslint:disable-line no-shadowed-variable
    def this(clusterer: yandexDashMapsLib.yandexDashMapsMod.Clusterer) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
  }
  
  @js.native
  class Hint protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IHintManager[yandexDashMapsLib.yandexDashMapsMod.Clusterer] {
    def this(clusterer: yandexDashMapsLib.yandexDashMapsMod.Clusterer) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
  }
  
}

