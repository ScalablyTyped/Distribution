package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Derivatives extends js.Object {
  
  var derivatives: js.UndefOr[Boolean] = js.native
  
  var drawBuffers: js.UndefOr[Boolean] = js.native
  
  var fragDepth: js.UndefOr[Boolean] = js.native
  
  var shaderTextureLOD: js.UndefOr[Boolean] = js.native
}
object Derivatives {
  
  @scala.inline
  def apply(): Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derivatives]
  }
  
  @scala.inline
  implicit class DerivativesOps[Self <: Derivatives] (val x: Self) extends AnyVal {
    
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
    def setDerivatives(value: Boolean): Self = this.set("derivatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDerivatives: Self = this.set("derivatives", js.undefined)
    
    @scala.inline
    def setDrawBuffers(value: Boolean): Self = this.set("drawBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawBuffers: Self = this.set("drawBuffers", js.undefined)
    
    @scala.inline
    def setFragDepth(value: Boolean): Self = this.set("fragDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragDepth: Self = this.set("fragDepth", js.undefined)
    
    @scala.inline
    def setShaderTextureLOD(value: Boolean): Self = this.set("shaderTextureLOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShaderTextureLOD: Self = this.set("shaderTextureLOD", js.undefined)
  }
}
