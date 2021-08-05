package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinedName extends StObject {
  
  /** Name comment */
  var Comment: js.UndefOr[String] = js.undefined
  
  /** Name */
  var Name: String
  
  /** Reference */
  var Ref: String
  
  /** Scope (undefined for workbook scope) */
  var Sheet: js.UndefOr[Double] = js.undefined
}
object DefinedName {
  
  inline def apply(Name: String, Ref: String): DefinedName = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedName]
  }
  
  extension [Self <: DefinedName](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "Ref", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: Double): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetUndefined: Self = StObject.set(x, "Sheet", js.undefined)
  }
}
