package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinedName extends StObject {
  
  /** Name comment */
  var Comment: js.UndefOr[String] = js.native
  
  /** Name */
  var Name: String = js.native
  
  /** Reference */
  var Ref: String = js.native
  
  /** Scope (undefined for workbook scope) */
  var Sheet: js.UndefOr[Double] = js.native
}
object DefinedName {
  
  @scala.inline
  def apply(Name: String, Ref: String): DefinedName = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedName]
  }
  
  @scala.inline
  implicit class DefinedNameMutableBuilder[Self <: DefinedName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "Ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: Double): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "Sheet", js.undefined)
  }
}
