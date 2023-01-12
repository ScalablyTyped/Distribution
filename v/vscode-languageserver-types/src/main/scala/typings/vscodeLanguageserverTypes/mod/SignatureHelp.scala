package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelp extends StObject {
  
  /**
    * The active parameter of the active signature. If omitted or the value
    * lies outside the range of `signatures[activeSignature].parameters`
    * defaults to 0 if the active signature has parameters. If
    * the active signature has no parameters it is ignored.
    * In future version of the protocol this property might become
    * mandatory to better express the active parameter if the
    * active signature does have any.
    */
  var activeParameter: js.UndefOr[uinteger] = js.undefined
  
  /**
    * The active signature. If omitted or the value lies outside the
    * range of `signatures` the value defaults to zero or is ignored if
    * the `SignatureHelp` has no signatures.
    *
    * Whenever possible implementors should make an active decision about
    * the active signature and shouldn't rely on a default value.
    *
    * In future version of the protocol this property might become
    * mandatory to better express this.
    */
  var activeSignature: js.UndefOr[uinteger] = js.undefined
  
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation]
}
object SignatureHelp {
  
  inline def apply(signatures: js.Array[SignatureInformation]): SignatureHelp = {
    val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureHelp] (val x: Self) extends AnyVal {
    
    inline def setActiveParameter(value: uinteger): Self = StObject.set(x, "activeParameter", value.asInstanceOf[js.Any])
    
    inline def setActiveParameterUndefined: Self = StObject.set(x, "activeParameter", js.undefined)
    
    inline def setActiveSignature(value: uinteger): Self = StObject.set(x, "activeSignature", value.asInstanceOf[js.Any])
    
    inline def setActiveSignatureUndefined: Self = StObject.set(x, "activeSignature", js.undefined)
    
    inline def setSignatures(value: js.Array[SignatureInformation]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: SignatureInformation*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
