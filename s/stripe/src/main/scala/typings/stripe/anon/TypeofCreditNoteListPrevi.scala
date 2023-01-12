package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCreditNoteListPrevi extends StObject {
  
  val Line: Any
}
object TypeofCreditNoteListPrevi {
  
  inline def apply(Line: Any): TypeofCreditNoteListPrevi = {
    val __obj = js.Dynamic.literal(Line = Line.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCreditNoteListPrevi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCreditNoteListPrevi] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Any): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
  }
}
