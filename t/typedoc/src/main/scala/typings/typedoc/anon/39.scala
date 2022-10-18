package typings.typedoc.anon

import typings.typedoc.typedocStrings.cname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var name: cname
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(name = "cname")
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setName(value: cname): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
