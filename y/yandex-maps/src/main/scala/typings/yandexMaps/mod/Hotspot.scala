package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "Hotspot")
@js.native
class Hotspot protected ()
  extends StObject
     with IHotspot {
  def this(shape: IShape) = this()
  def this(shape: IShape, zIndex: Double) = this()
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
}
