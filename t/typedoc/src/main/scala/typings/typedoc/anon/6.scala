package typings.typedoc.anon

import typings.typedoc.typedocStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var name: pretty
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(name = "pretty")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setName(value: pretty): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
