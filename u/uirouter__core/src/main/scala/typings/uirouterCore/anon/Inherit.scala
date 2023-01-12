package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inherit extends StObject {
  
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  var matchingKeys: js.UndefOr[Any] = js.undefined
}
object Inherit {
  
  inline def apply(): Inherit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inherit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inherit] (val x: Self) extends AnyVal {
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setMatchingKeys(value: Any): Self = StObject.set(x, "matchingKeys", value.asInstanceOf[js.Any])
    
    inline def setMatchingKeysUndefined: Self = StObject.set(x, "matchingKeys", js.undefined)
  }
}
