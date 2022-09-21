package typings.typedoc.anon

import typings.typedoc.typedocStrings.externalPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var name: externalPattern
}
object `59` {
  
  inline def apply(): `59` = {
    val __obj = js.Dynamic.literal(name = "externalPattern")
    __obj.asInstanceOf[`59`]
  }
  
  extension [Self <: `59`](x: Self) {
    
    inline def setName(value: externalPattern): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
