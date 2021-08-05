package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mdurl extends StObject {
  
  var mdurl: Decode
  
  var ucmicro: Any
}
object Mdurl {
  
  inline def apply(mdurl: Decode, ucmicro: Any): Mdurl = {
    val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any], ucmicro = ucmicro.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mdurl]
  }
  
  extension [Self <: Mdurl](x: Self) {
    
    inline def setMdurl(value: Decode): Self = StObject.set(x, "mdurl", value.asInstanceOf[js.Any])
    
    inline def setUcmicro(value: Any): Self = StObject.set(x, "ucmicro", value.asInstanceOf[js.Any])
  }
}
