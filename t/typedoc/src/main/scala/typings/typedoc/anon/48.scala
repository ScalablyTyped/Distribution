package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludePrivate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var name: excludePrivate
}
object `48` {
  
  inline def apply(): `48` = {
    val __obj = js.Dynamic.literal(name = "excludePrivate")
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `48`] (val x: Self) extends AnyVal {
    
    inline def setName(value: excludePrivate): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
