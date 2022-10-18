package typings.typedoc.anon

import typings.typedoc.typedocStrings.lightHighlightTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var name: lightHighlightTheme
}
object `40` {
  
  inline def apply(): `40` = {
    val __obj = js.Dynamic.literal(name = "lightHighlightTheme")
    __obj.asInstanceOf[`40`]
  }
  
  extension [Self <: `40`](x: Self) {
    
    inline def setName(value: lightHighlightTheme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
