package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCreditNoteCreatePar extends StObject {
  
  val Line: Any
}
object TypeofCreditNoteCreatePar {
  
  inline def apply(Line: Any): TypeofCreditNoteCreatePar = {
    val __obj = js.Dynamic.literal(Line = Line.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCreditNoteCreatePar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCreditNoteCreatePar] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Any): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
  }
}
