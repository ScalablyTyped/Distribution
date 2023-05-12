package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values extends StObject {
  
  var values: ClientHeight
}
object Values {
  
  inline def apply(values: ClientHeight): Values = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
    
    inline def setValues(value: ClientHeight): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
