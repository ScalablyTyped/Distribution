package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerificationReport extends StObject {
  
  val Document: TypeofDocument
  
  val IdNumber: TypeofIdNumber
  
  val Options: TypeofOptions
  
  val Selfie: TypeofSelfie
}
object TypeofVerificationReport {
  
  inline def apply(Document: TypeofDocument, IdNumber: TypeofIdNumber, Options: TypeofOptions, Selfie: TypeofSelfie): TypeofVerificationReport = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], IdNumber = IdNumber.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Selfie = Selfie.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerificationReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofVerificationReport] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: TypeofDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setIdNumber(value: TypeofIdNumber): Self = StObject.set(x, "IdNumber", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setSelfie(value: TypeofSelfie): Self = StObject.set(x, "Selfie", value.asInstanceOf[js.Any])
  }
}
