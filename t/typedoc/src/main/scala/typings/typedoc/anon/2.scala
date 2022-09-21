package typings.typedoc.anon

import typings.typedoc.typedocStrings.compilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var name: compilerOptions
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(name = "compilerOptions")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setName(value: compilerOptions): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
