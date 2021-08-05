package typings.typeorm.anon

import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.insert
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cascade extends StObject {
  
  var cascade: js.UndefOr[Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])] = js.undefined
}
object Cascade {
  
  inline def apply(): Cascade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cascade]
  }
  
  extension [Self <: Cascade](x: Self) {
    
    inline def setCascade(value: Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    
    inline def setCascadeVarargs(value: (insert | update | remove | `soft-remove` | recover)*): Self = StObject.set(x, "cascade", js.Array(value :_*))
  }
}
