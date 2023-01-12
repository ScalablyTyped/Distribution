package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOptions extends StObject {
  
  val Document: Any
}
object TypeofOptions {
  
  inline def apply(Document: Any): TypeofOptions = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofOptions] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: Any): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
  }
}
