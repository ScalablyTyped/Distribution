package typings.typedoc.anon

import typings.typedoc.typedocStrings.ignoreCompilerErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var name: ignoreCompilerErrors
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(name = "ignoreCompilerErrors")
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setName(value: ignoreCompilerErrors): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
