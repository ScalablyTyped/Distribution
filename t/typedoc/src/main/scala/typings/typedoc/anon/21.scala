package typings.typedoc.anon

import typings.typedoc.typedocStrings.help
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var name: help
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(name = "help")
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setName(value: help): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
