package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filled extends StObject {
  
  var filled: js.UndefOr[Boolean] = js.undefined
}
object Filled {
  
  inline def apply(): Filled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filled] (val x: Self) extends AnyVal {
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
  }
}
