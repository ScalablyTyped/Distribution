package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterer {
  
  @JSImport("yandex-maps", "clusterer.Balloon")
  @js.native
  open class Balloon protected ()
    extends StObject
       with IBalloonManager[Clusterer_] {
    def this(clusterer: Clusterer_) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
  }
  
  @JSImport("yandex-maps", "clusterer.Hint")
  @js.native
  open class Hint protected ()
    extends StObject
       with IPopupManager[Clusterer_] {
    def this(clusterer: Clusterer_) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
  }
}
