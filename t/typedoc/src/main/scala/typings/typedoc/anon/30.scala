package typings.typedoc.anon

import typings.typedoc.typedocStrings.showConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var name: showConfig
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal(name = "showConfig")
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setName(value: showConfig): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
