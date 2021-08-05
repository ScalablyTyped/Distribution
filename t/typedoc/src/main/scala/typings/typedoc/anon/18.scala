package typings.typedoc.anon

import typings.typedoc.typedocStrings.disableSources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var name: disableSources
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal(name = "disableSources")
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setName(value: disableSources): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
