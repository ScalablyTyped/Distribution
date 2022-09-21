package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.map.pane.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpane extends StObject {
  
  var Manager: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.pane.Manager]
}
object Typeofpane {
  
  inline def apply(Manager: Instantiable1[/* map */ Map_, Manager]): Typeofpane = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpane]
  }
  
  extension [Self <: Typeofpane](x: Self) {
    
    inline def setManager(value: Instantiable1[/* map */ Map_, Manager]): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
