package typings.typedoc.anon

import typings.typedoc.typedocStrings.help
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var name: help
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal(name = "help")
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setName(value: help): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
