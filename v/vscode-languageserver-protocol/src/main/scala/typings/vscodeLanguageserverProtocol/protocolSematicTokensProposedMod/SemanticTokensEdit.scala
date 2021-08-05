package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensEdit extends StObject {
  
  var data: js.UndefOr[js.Array[Double]] = js.undefined
  
  var deleteCount: Double
  
  var start: Double
}
object SemanticTokensEdit {
  
  inline def apply(deleteCount: Double, start: Double): SemanticTokensEdit = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdit]
  }
  
  extension [Self <: SemanticTokensEdit](x: Self) {
    
    inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
