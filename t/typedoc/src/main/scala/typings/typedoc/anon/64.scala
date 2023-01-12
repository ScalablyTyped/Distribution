package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeExternals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  var name: excludeExternals
}
object `64` {
  
  inline def apply(): `64` = {
    val __obj = js.Dynamic.literal(name = "excludeExternals")
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `64`] (val x: Self) extends AnyVal {
    
    inline def setName(value: excludeExternals): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
