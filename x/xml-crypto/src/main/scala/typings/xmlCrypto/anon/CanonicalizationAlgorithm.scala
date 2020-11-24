package typings.xmlCrypto.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanonicalizationAlgorithm extends js.Object {
  
  var canonicalizationAlgorithm: js.UndefOr[String] = js.native
  
  var idAttribute: js.UndefOr[String] = js.native
  
  var implicitTransforms: js.UndefOr[js.Array[String]] = js.native
  
  var signatureAlgorithm: js.UndefOr[String] = js.native
}
object CanonicalizationAlgorithm {
  
  @scala.inline
  def apply(): CanonicalizationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanonicalizationAlgorithm]
  }
  
  @scala.inline
  implicit class CanonicalizationAlgorithmOps[Self <: CanonicalizationAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setCanonicalizationAlgorithm(value: String): Self = this.set("canonicalizationAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalizationAlgorithm: Self = this.set("canonicalizationAlgorithm", js.undefined)
    
    @scala.inline
    def setIdAttribute(value: String): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdAttribute: Self = this.set("idAttribute", js.undefined)
    
    @scala.inline
    def setImplicitTransformsVarargs(value: String*): Self = this.set("implicitTransforms", js.Array(value :_*))
    
    @scala.inline
    def setImplicitTransforms(value: js.Array[String]): Self = this.set("implicitTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitTransforms: Self = this.set("implicitTransforms", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
  }
}
