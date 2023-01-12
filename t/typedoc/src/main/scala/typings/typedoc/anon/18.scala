package typings.typedoc.anon

import typings.typedoc.typedocStrings.emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var name: emit
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal(name = "emit")
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`] (val x: Self) extends AnyVal {
    
    inline def setName(value: emit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
