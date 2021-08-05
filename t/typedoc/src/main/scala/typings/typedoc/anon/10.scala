package typings.typedoc.anon

import typings.typedoc.typedocStrings.inputFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var name: inputFiles
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(name = "inputFiles")
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setName(value: inputFiles): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
