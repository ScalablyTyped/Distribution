package typings.typedoc.anon

import typings.typedoc.typedocStrings.blockTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var name: blockTags
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal(name = "blockTags")
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setName(value: blockTags): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
