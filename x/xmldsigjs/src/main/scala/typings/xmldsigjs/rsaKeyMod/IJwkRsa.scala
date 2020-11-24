package typings.xmldsigjs.rsaKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJwkRsa extends js.Object {
  
  var alg: String = js.native
  
  var e: String = js.native
  
  var ext: Boolean = js.native
  
  var kty: String = js.native
  
  var n: String = js.native
}
object IJwkRsa {
  
  @scala.inline
  def apply(alg: String, e: String, ext: Boolean, kty: String, n: String): IJwkRsa = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJwkRsa]
  }
  
  @scala.inline
  implicit class IJwkRsaOps[Self <: IJwkRsa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: Boolean): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
  }
}
