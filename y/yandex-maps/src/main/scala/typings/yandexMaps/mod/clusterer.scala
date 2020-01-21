package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "clusterer")
@js.native
object clusterer extends js.Object {
  @js.native
  class Balloon protected () extends IBalloonManager[Clusterer_] {
    //tslint:disable-line no-shadowed-variable
    def this(clusterer: Clusterer_) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class Hint protected () extends IPopupManager[Clusterer_] {
    def this(clusterer: Clusterer_) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
}

