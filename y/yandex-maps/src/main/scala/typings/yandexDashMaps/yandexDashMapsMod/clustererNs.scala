package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "clusterer")
@js.native
object clustererNs extends js.Object {
  @js.native
  class Balloon protected () extends IBalloonManager[Clusterer] {
    //tslint:disable-line no-shadowed-variable
    def this(clusterer: Clusterer) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class Hint protected () extends IHintManager[Clusterer] {
    def this(clusterer: Clusterer) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
}

