package typings.typedoc.anon

import typings.typedoc.typedocStrings.tsconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  var name: tsconfig
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal(name = "tsconfig")
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setName(value: tsconfig): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
