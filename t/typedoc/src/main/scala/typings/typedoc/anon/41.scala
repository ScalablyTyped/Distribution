package typings.typedoc.anon

import typings.typedoc.typedocStrings.externalSymbolLinkMappings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var name: externalSymbolLinkMappings
}
object `41` {
  
  inline def apply(): `41` = {
    val __obj = js.Dynamic.literal(name = "externalSymbolLinkMappings")
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `41`] (val x: Self) extends AnyVal {
    
    inline def setName(value: externalSymbolLinkMappings): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
