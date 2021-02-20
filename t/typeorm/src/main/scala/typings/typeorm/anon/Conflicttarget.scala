package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conflicttarget extends StObject {
  
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  var conflict_target: js.UndefOr[String | js.Array[String]] = js.native
  
  var overwrite: js.UndefOr[js.Array[String]] = js.native
}
object Conflicttarget {
  
  @scala.inline
  def apply(): Conflicttarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conflicttarget]
  }
  
  @scala.inline
  implicit class ConflicttargetMutableBuilder[Self <: Conflicttarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setConflict_target(value: String | js.Array[String]): Self = StObject.set(x, "conflict_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflict_targetUndefined: Self = StObject.set(x, "conflict_target", js.undefined)
    
    @scala.inline
    def setConflict_targetVarargs(value: String*): Self = StObject.set(x, "conflict_target", js.Array(value :_*))
    
    @scala.inline
    def setOverwrite(value: js.Array[String]): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setOverwriteVarargs(value: String*): Self = StObject.set(x, "overwrite", js.Array(value :_*))
  }
}
