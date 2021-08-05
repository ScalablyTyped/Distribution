package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensPartialResult extends StObject {
  
  var data: js.Array[Double]
}
object SemanticTokensPartialResult {
  
  inline def apply(data: js.Array[Double]): SemanticTokensPartialResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensPartialResult]
  }
  
  extension [Self <: SemanticTokensPartialResult](x: Self) {
    
    inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
