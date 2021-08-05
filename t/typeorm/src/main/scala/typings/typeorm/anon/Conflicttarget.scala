package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflicttarget extends StObject {
  
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  var conflict_target: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var overwrite: js.UndefOr[js.Array[String]] = js.undefined
}
object Conflicttarget {
  
  inline def apply(): Conflicttarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conflicttarget]
  }
  
  extension [Self <: Conflicttarget](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setConflict_target(value: String | js.Array[String]): Self = StObject.set(x, "conflict_target", value.asInstanceOf[js.Any])
    
    inline def setConflict_targetUndefined: Self = StObject.set(x, "conflict_target", js.undefined)
    
    inline def setConflict_targetVarargs(value: String*): Self = StObject.set(x, "conflict_target", js.Array(value :_*))
    
    inline def setOverwrite(value: js.Array[String]): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setOverwriteVarargs(value: String*): Self = StObject.set(x, "overwrite", js.Array(value :_*))
  }
}
