package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "clusterer")
@js.native
object clusterer extends js.Object {
  
  @js.native
  class Balloon protected () extends IBalloonManager[Clusterer_] {
    def this(clusterer: Clusterer_) = this()
  }
  
  @js.native
  class Hint protected () extends IPopupManager[Clusterer_] {
    def this(clusterer: Clusterer_) = this()
  }
}
