package typings.typedoc.anon

import typings.typedoc.typedocStrings.tsconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var name: tsconfig
}
object `42` {
  
  inline def apply(): `42` = {
    val __obj = js.Dynamic.literal(name = "tsconfig")
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setName(value: tsconfig): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
