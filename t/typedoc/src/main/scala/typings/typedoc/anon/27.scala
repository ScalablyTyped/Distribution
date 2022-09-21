package typings.typedoc.anon

import typings.typedoc.typedocStrings.plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var name: plugin
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal(name = "plugin")
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setName(value: plugin): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
