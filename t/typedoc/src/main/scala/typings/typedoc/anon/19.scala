package typings.typedoc.anon

import typings.typedoc.typedocStrings.exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var name: exclude
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(name = "exclude")
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`] (val x: Self) extends AnyVal {
    
    inline def setName(value: exclude): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
