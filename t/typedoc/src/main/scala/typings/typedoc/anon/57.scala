package typings.typedoc.anon

import typings.typedoc.typedocStrings.htmlLang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  var name: htmlLang
}
object `57` {
  
  inline def apply(): `57` = {
    val __obj = js.Dynamic.literal(name = "htmlLang")
    __obj.asInstanceOf[`57`]
  }
  
  extension [Self <: `57`](x: Self) {
    
    inline def setName(value: htmlLang): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
