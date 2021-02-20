package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classifications extends StObject {
  
  var endOfLineState: EndOfLineState = js.native
  
  var spans: js.Array[Double] = js.native
}
object Classifications {
  
  @scala.inline
  def apply(endOfLineState: EndOfLineState, spans: js.Array[Double]): Classifications = {
    val __obj = js.Dynamic.literal(endOfLineState = endOfLineState.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifications]
  }
  
  @scala.inline
  implicit class ClassificationsMutableBuilder[Self <: Classifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOfLineState(value: EndOfLineState): Self = StObject.set(x, "endOfLineState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpans(value: js.Array[Double]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpansVarargs(value: Double*): Self = StObject.set(x, "spans", js.Array(value :_*))
  }
}
