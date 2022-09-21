package typings.typedoc.anon

import typings.typedoc.typedocStrings.htmlLang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var name: htmlLang
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal(name = "htmlLang")
    __obj.asInstanceOf[`54`]
  }
  
  extension [Self <: `54`](x: Self) {
    
    inline def setName(value: htmlLang): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
