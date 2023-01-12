package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFilterFlags extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
}
object IFilterFlags {
  
  inline def apply(): IFilterFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFilterFlags] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
  }
}
