package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensEdit extends StObject {
  
  /**
    * The elements to insert.
    */
  var data: js.UndefOr[js.Array[uinteger]] = js.undefined
  
  /**
    * The count of elements to remove.
    */
  var deleteCount: uinteger
  
  /**
    * The start offset of the edit.
    */
  var start: uinteger
}
object SemanticTokensEdit {
  
  inline def apply(deleteCount: uinteger, start: uinteger): SemanticTokensEdit = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdit]
  }
  
  extension [Self <: SemanticTokensEdit](x: Self) {
    
    inline def setData(value: js.Array[uinteger]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: uinteger*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDeleteCount(value: uinteger): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
    
    inline def setStart(value: uinteger): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
