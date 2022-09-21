package typings.typedoc.anon

import typings.typedoc.typedocStrings.readme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var name: readme
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal(name = "readme")
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setName(value: readme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
