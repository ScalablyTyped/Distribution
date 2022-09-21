package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typings.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdata extends StObject {
  
  var Manager: Instantiable1[/* data */ js.UndefOr[js.Object], typings.yandexMaps.mod.data.Manager]
}
object Typeofdata {
  
  inline def apply(Manager: Instantiable1[/* data */ js.UndefOr[js.Object], Manager]): Typeofdata = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdata]
  }
  
  extension [Self <: Typeofdata](x: Self) {
    
    inline def setManager(value: Instantiable1[/* data */ js.UndefOr[js.Object], Manager]): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
  }
}
