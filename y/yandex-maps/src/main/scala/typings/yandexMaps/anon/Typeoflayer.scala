package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable2
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.map.layer.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflayer extends StObject {
  
  var Manager: Instantiable2[
    /* map */ Map_, 
    /* options */ js.UndefOr[TrafficImageZIndex], 
    typings.yandexMaps.mod.map.layer.Manager
  ]
}
object Typeoflayer {
  
  inline def apply(Manager: Instantiable2[/* map */ Map_, /* options */ js.UndefOr[TrafficImageZIndex], Manager]): Typeoflayer = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflayer]
  }
  
  extension [Self <: Typeoflayer](x: Self) {
    
    inline def setManager(value: Instantiable2[/* map */ Map_, /* options */ js.UndefOr[TrafficImageZIndex], Manager]): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
