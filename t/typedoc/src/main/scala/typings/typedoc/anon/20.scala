package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeNotExported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var name: excludeNotExported
}
object `20` {
  
  inline def apply(): `20` = {
    val __obj = js.Dynamic.literal(name = "excludeNotExported")
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setName(value: excludeNotExported): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
