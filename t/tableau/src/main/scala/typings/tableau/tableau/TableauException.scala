package typings.tableau.tableau

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Error Classes
trait TableauException
  extends StObject
     with Error {
  
  var tableauSoftwareErrorCode: ErrorCode
}
object TableauException {
  
  inline def apply(message: String, name: String, tableauSoftwareErrorCode: ErrorCode): TableauException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableauSoftwareErrorCode = tableauSoftwareErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableauException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableauException] (val x: Self) extends AnyVal {
    
    inline def setTableauSoftwareErrorCode(value: ErrorCode): Self = StObject.set(x, "tableauSoftwareErrorCode", value.asInstanceOf[js.Any])
  }
}
