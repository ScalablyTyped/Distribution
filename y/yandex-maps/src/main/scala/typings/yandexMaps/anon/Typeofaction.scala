package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.map.action.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofaction extends StObject {
  
  var Manager: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.action.Manager]
}
object Typeofaction {
  
  inline def apply(Manager: Instantiable1[/* map */ Map_, Manager]): Typeofaction = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofaction]
  }
  
  extension [Self <: Typeofaction](x: Self) {
    
    inline def setManager(value: Instantiable1[/* map */ Map_, Manager]): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
