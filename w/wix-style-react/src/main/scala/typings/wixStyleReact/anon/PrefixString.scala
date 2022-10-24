package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixString extends StObject {
  
  var prefix: String
  
  var suffix: String
}
object PrefixString {
  
  inline def apply(prefix: String, suffix: String): PrefixString = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixString]
  }
  
  extension [Self <: PrefixString](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
