package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureInfo extends StObject {
  
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
  implicit class SignatureInfoMutableBuilder[Self <: SignatureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveFormal(value: Double): Self = StObject.set(x, "activeFormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActual(value: ActualSignatureInfo): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormal(value: js.Array[FormalSignatureItemInfo]): Self = StObject.set(x, "formal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormalVarargs(value: FormalSignatureItemInfo*): Self = StObject.set(x, "formal", js.Array(value :_*))
  }
}
