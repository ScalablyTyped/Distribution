package typings.typedoc.anon

import typings.typedoc.typedocStrings.externalSymbolLinkMappings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var name: externalSymbolLinkMappings
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(name = "externalSymbolLinkMappings")
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setName(value: externalSymbolLinkMappings): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
