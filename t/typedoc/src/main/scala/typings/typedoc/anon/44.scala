package typings.typedoc.anon

import typings.typedoc.typedocStrings.treatWarningsAsErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  var name: treatWarningsAsErrors
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal(name = "treatWarningsAsErrors")
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setName(value: treatWarningsAsErrors): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
