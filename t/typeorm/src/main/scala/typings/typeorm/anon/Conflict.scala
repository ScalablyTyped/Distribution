package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflict extends StObject {
  
  var columns: js.UndefOr[String] = js.undefined
  
  var conflict: js.UndefOr[String] = js.undefined
  
  var overwrite: js.UndefOr[String] = js.undefined
}
object Conflict {
  
  @scala.inline
  def apply(): Conflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conflict]
  }
  
  @scala.inline
  implicit class ConflictMutableBuilder[Self <: Conflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setConflict(value: String): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictUndefined: Self = StObject.set(x, "conflict", js.undefined)
    
    @scala.inline
    def setOverwrite(value: String): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
