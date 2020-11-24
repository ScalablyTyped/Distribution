package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureInfo extends js.Object {
  
  var activeFormal: Double = js.native
  
  var actual: ActualSignatureInfo = js.native
  
  var formal: js.Array[FormalSignatureItemInfo] = js.native
}
object SignatureInfo {
  
  @scala.inline
  def apply(activeFormal: Double, actual: ActualSignatureInfo, formal: js.Array[FormalSignatureItemInfo]): SignatureInfo = {
    val __obj = js.Dynamic.literal(activeFormal = activeFormal.asInstanceOf[js.Any], actual = actual.asInstanceOf[js.Any], formal = formal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInfo]
  }
  
  @scala.inline
  implicit class SignatureInfoOps[Self <: SignatureInfo] (val x: Self) extends AnyVal {
    
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
    def setActiveFormal(value: Double): Self = this.set("activeFormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActual(value: ActualSignatureInfo): Self = this.set("actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormalVarargs(value: FormalSignatureItemInfo*): Self = this.set("formal", js.Array(value :_*))
    
    @scala.inline
    def setFormal(value: js.Array[FormalSignatureItemInfo]): Self = this.set("formal", value.asInstanceOf[js.Any])
  }
}
