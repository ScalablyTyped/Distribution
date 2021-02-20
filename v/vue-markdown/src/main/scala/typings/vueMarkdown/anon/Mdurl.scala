package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mdurl extends StObject {
  
  var mdurl: Decode = js.native
  
  var ucmicro: Any = js.native
}
object Mdurl {
  
  @scala.inline
  def apply(mdurl: Decode, ucmicro: Any): Mdurl = {
    val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any], ucmicro = ucmicro.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mdurl]
  }
  
  @scala.inline
  implicit class MdurlMutableBuilder[Self <: Mdurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMdurl(value: Decode): Self = StObject.set(x, "mdurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUcmicro(value: Any): Self = StObject.set(x, "ucmicro", value.asInstanceOf[js.Any])
  }
}
