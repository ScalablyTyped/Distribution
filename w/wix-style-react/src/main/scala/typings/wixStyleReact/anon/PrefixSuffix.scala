package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixSuffix extends StObject {
  
  var prefix: Requireable[String]
  
  var suffix: Requireable[String]
}
object PrefixSuffix {
  
  inline def apply(prefix: Requireable[String], suffix: Requireable[String]): PrefixSuffix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixSuffix]
  }
  
  extension [Self <: PrefixSuffix](x: Self) {
    
    inline def setPrefix(value: Requireable[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: Requireable[String]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
