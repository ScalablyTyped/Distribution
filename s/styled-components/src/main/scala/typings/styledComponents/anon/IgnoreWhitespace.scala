package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreWhitespace extends StObject {
  
  var ignoreWhitespace: Boolean
}
object IgnoreWhitespace {
  
  inline def apply(ignoreWhitespace: Boolean): IgnoreWhitespace = {
    val __obj = js.Dynamic.literal(ignoreWhitespace = ignoreWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreWhitespace]
  }
  
  extension [Self <: IgnoreWhitespace](x: Self) {
    
    inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
  }
}
