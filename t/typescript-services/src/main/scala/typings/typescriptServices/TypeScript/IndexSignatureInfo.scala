package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSignatureInfo extends StObject {
  
  var numericSignature: PullSignatureSymbol = js.native
  
  var stringSignature: PullSignatureSymbol = js.native
}
object IndexSignatureInfo {
  
  @scala.inline
  def apply(numericSignature: PullSignatureSymbol, stringSignature: PullSignatureSymbol): IndexSignatureInfo = {
    val __obj = js.Dynamic.literal(numericSignature = numericSignature.asInstanceOf[js.Any], stringSignature = stringSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSignatureInfo]
  }
  
  @scala.inline
  implicit class IndexSignatureInfoMutableBuilder[Self <: IndexSignatureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumericSignature(value: PullSignatureSymbol): Self = StObject.set(x, "numericSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringSignature(value: PullSignatureSymbol): Self = StObject.set(x, "stringSignature", value.asInstanceOf[js.Any])
  }
}
