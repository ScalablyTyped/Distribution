package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelp extends StObject {
  
  /**
    * The active parameter of the active signature. Set to `null`
    * if the active signature has no parameters.
    */
  var activeParameter: Double | Null
  
  /**
    * The active signature. Set to `null` if no
    * signatures exist.
    */
  var activeSignature: Double | Null
  
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation]
}
object SignatureHelp {
  
  inline def apply(signatures: js.Array[SignatureInformation]): SignatureHelp = {
    val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any], activeParameter = null, activeSignature = null)
    __obj.asInstanceOf[SignatureHelp]
  }
  
  extension [Self <: SignatureHelp](x: Self) {
    
    inline def setActiveParameter(value: Double): Self = StObject.set(x, "activeParameter", value.asInstanceOf[js.Any])
    
    inline def setActiveParameterNull: Self = StObject.set(x, "activeParameter", null)
    
    inline def setActiveSignature(value: Double): Self = StObject.set(x, "activeSignature", value.asInstanceOf[js.Any])
    
    inline def setActiveSignatureNull: Self = StObject.set(x, "activeSignature", null)
    
    inline def setSignatures(value: js.Array[SignatureInformation]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: SignatureInformation*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
