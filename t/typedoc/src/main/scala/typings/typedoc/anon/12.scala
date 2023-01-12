package typings.typedoc.anon

import typings.typedoc.typedocStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var name: json
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal(name = "json")
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`] (val x: Self) extends AnyVal {
    
    inline def setName(value: json): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
