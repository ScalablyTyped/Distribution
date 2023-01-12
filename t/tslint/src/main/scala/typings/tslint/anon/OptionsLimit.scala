package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsLimit extends StObject {
  
  var options: Limit
}
object OptionsLimit {
  
  inline def apply(options: Limit): OptionsLimit = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsLimit] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Limit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
