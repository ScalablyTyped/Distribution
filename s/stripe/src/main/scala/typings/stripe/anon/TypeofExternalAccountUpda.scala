package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofExternalAccountUpda extends StObject {
  
  val Documents: Any
}
object TypeofExternalAccountUpda {
  
  inline def apply(Documents: Any): TypeofExternalAccountUpda = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofExternalAccountUpda]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofExternalAccountUpda] (val x: Self) extends AnyVal {
    
    inline def setDocuments(value: Any): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
  }
}
