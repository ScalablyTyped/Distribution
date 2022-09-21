package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typings.std.HTMLElement
import typings.yandexMaps.mod.util.cursor.Accessor
import typings.yandexMaps.mod.util.cursor.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcursor extends StObject {
  
  var Accessor: Instantiable1[/* key */ String, typings.yandexMaps.mod.util.cursor.Accessor]
  
  var Manager: Instantiable1[/* element */ HTMLElement, typings.yandexMaps.mod.util.cursor.Manager]
}
object Typeofcursor {
  
  inline def apply(
    Accessor: Instantiable1[/* key */ String, Accessor],
    Manager: Instantiable1[/* element */ HTMLElement, Manager]
  ): Typeofcursor = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcursor]
  }
  
  extension [Self <: Typeofcursor](x: Self) {
    
    inline def setAccessor(value: Instantiable1[/* key */ String, Accessor]): Self = StObject.set(x, "Accessor", value.asInstanceOf[js.Any])
    
    inline def setManager(value: Instantiable1[/* element */ HTMLElement, Manager]): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
