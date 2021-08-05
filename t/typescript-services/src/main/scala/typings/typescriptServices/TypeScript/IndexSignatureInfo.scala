package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexSignatureInfo extends StObject {
  
  var numericSignature: PullSignatureSymbol
  
  var stringSignature: PullSignatureSymbol
}
object IndexSignatureInfo {
  
  inline def apply(numericSignature: PullSignatureSymbol, stringSignature: PullSignatureSymbol): IndexSignatureInfo = {
    val __obj = js.Dynamic.literal(numericSignature = numericSignature.asInstanceOf[js.Any], stringSignature = stringSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSignatureInfo]
  }
  
  extension [Self <: IndexSignatureInfo](x: Self) {
    
    inline def setNumericSignature(value: PullSignatureSymbol): Self = StObject.set(x, "numericSignature", value.asInstanceOf[js.Any])
    
    inline def setStringSignature(value: PullSignatureSymbol): Self = StObject.set(x, "stringSignature", value.asInstanceOf[js.Any])
  }
}
