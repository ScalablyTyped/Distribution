package typings.typedoc.anon

import typings.typedoc.typedocStrings.basePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var name: basePath
}
object `52` {
  
  inline def apply(): `52` = {
    val __obj = js.Dynamic.literal(name = "basePath")
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setName(value: basePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
