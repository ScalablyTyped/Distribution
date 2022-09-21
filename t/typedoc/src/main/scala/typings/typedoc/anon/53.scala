package typings.typedoc.anon

import typings.typedoc.typedocStrings.commentStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var name: commentStyle
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal(name = "commentStyle")
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setName(value: commentStyle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
