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
  
  inline def apply(): Conflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conflict]
  }
  
  extension [Self <: Conflict](x: Self) {
    
    inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setConflict(value: String): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    inline def setConflictUndefined: Self = StObject.set(x, "conflict", js.undefined)
    
    inline def setOverwrite(value: String): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
