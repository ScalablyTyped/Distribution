package typings.vite.anon

import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolve extends StObject {
  
  var resolve: js.UndefOr[String | `false` | Null] = js.undefined
}
object Resolve {
  
  inline def apply(): Resolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resolve] (val x: Self) extends AnyVal {
    
    inline def setResolve(value: String | `false`): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveNull: Self = StObject.set(x, "resolve", null)
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
  }
}
