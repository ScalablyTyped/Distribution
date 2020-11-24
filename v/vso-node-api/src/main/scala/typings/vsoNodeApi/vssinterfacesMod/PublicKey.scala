package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends js.Object {
  
  /**
    * Gets or sets the exponent for the public key.
    */
  var exponent: js.Array[Double] = js.native
  
  /**
    * Gets or sets the modulus for the public key.
    */
  var modulus: js.Array[Double] = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(exponent: js.Array[Double], modulus: js.Array[Double]): PublicKey = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    
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
    def setExponentVarargs(value: Double*): Self = this.set("exponent", js.Array(value :_*))
    
    @scala.inline
    def setExponent(value: js.Array[Double]): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulusVarargs(value: Double*): Self = this.set("modulus", js.Array(value :_*))
    
    @scala.inline
    def setModulus(value: js.Array[Double]): Self = this.set("modulus", value.asInstanceOf[js.Any])
  }
}
