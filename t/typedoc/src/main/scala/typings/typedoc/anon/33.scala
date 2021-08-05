package typings.typedoc.anon

import typings.typedoc.typedocStrings.categorizeByGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var name: categorizeByGroup
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(name = "categorizeByGroup")
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setName(value: categorizeByGroup): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
