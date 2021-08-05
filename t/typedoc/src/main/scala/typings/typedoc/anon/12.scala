package typings.typedoc.anon

import typings.typedoc.typedocStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var name: theme
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal(name = "theme")
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setName(value: theme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
