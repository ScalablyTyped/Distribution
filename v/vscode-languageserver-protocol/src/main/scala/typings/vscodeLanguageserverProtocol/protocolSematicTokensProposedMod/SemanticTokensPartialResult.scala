package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensPartialResult extends StObject {
  
  var data: js.Array[Double] = js.native
}
object SemanticTokensPartialResult {
  
  @scala.inline
  def apply(data: js.Array[Double]): SemanticTokensPartialResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensPartialResult]
  }
  
  @scala.inline
  implicit class SemanticTokensPartialResultMutableBuilder[Self <: SemanticTokensPartialResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
