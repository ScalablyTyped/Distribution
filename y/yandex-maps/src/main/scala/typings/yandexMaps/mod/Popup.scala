package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "Popup")
@js.native
class Popup[T] protected ()
  extends StObject
     with IPopup[T] {
  def this(map: Map_) = this()
  def this(map: Map_, options: IPopupOptions) = this()
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  /* CompleteClass */
  var options: IOptionManager = js.native
}
