package typings.typedoc.anon

import typings.typedoc.typedocStrings.help
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var name: help
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(name = "help")
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setName(value: help): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
