package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDefaults extends StObject {
  
  /**
    * The client supports the following itemDefaults on
    * a completion list.
    *
    * The value lists the supported property names of the
    * `CompletionList.itemDefaults` object. If omitted
    * no properties are supported.
    *
    * @since 3.17.0
    */
  var itemDefaults: js.UndefOr[js.Array[String]] = js.undefined
}
object ItemDefaults {
  
  inline def apply(): ItemDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemDefaults]
  }
  
  extension [Self <: ItemDefaults](x: Self) {
    
    inline def setItemDefaults(value: js.Array[String]): Self = StObject.set(x, "itemDefaults", value.asInstanceOf[js.Any])
    
    inline def setItemDefaultsUndefined: Self = StObject.set(x, "itemDefaults", js.undefined)
    
    inline def setItemDefaultsVarargs(value: String*): Self = StObject.set(x, "itemDefaults", js.Array(value*))
  }
}
