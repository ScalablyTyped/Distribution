package typings.vscodeNotebookRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait OutputId extends StObject {
    
    var outputId: String = js.native
  }
  object OutputId {
    
    @scala.inline
    def apply(outputId: String): OutputId = {
      val __obj = js.Dynamic.literal(outputId = outputId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputId]
    }
    
    @scala.inline
    implicit class OutputIdMutableBuilder[Self <: OutputId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputId(value: String): Self = StObject.set(x, "outputId", value.asInstanceOf[js.Any])
    }
  }
}
