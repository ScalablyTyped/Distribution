package typings.vscodeNotebookRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OutputId extends StObject {
    
    var outputId: String
  }
  object OutputId {
    
    inline def apply(outputId: String): OutputId = {
      val __obj = js.Dynamic.literal(outputId = outputId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputId]
    }
    
    extension [Self <: OutputId](x: Self) {
      
      inline def setOutputId(value: String): Self = StObject.set(x, "outputId", value.asInstanceOf[js.Any])
    }
  }
}
