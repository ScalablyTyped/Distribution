package typings.typedoc.anon

import typings.typedoc.typedocStrings.customCss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var name: customCss
}
object `35` {
  
  inline def apply(): `35` = {
    val __obj = js.Dynamic.literal(name = "customCss")
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setName(value: customCss): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
