package typings.typedoc.anon

import typings.typedoc.typedocStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var name: theme
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal(name = "theme")
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setName(value: theme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
