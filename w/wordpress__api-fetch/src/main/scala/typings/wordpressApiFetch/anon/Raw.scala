package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  var raw: String
  
  var rendered: String
}
object Raw {
  
  inline def apply(raw: String, rendered: String): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  extension [Self <: Raw](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: String): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
