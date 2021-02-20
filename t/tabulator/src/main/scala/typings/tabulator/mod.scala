package typings.tabulator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*~ Write your module's methods and properties in this class */
  @JSImport("tabulator", JSImport.Namespace)
  @js.native
  class ^ () extends Tabulator
  
  /*~ Write your module's methods and properties in this class */
  @js.native
  trait Tabulator extends StObject {
    
    // myMethod(opts: Tabulator.chartType): number;
    var defaultShowAttribute: String = js.native
    
    def toHtmlTable(matrix: js.Object): js.Any = js.native
    
    def toMatrix(datum: js.Object): js.Object = js.native
  }
  object Tabulator {
    
    @scala.inline
    def apply(defaultShowAttribute: String, toHtmlTable: js.Object => js.Any, toMatrix: js.Object => js.Object): Tabulator = {
      val __obj = js.Dynamic.literal(defaultShowAttribute = defaultShowAttribute.asInstanceOf[js.Any], toHtmlTable = js.Any.fromFunction1(toHtmlTable), toMatrix = js.Any.fromFunction1(toMatrix))
      __obj.asInstanceOf[Tabulator]
    }
    
    @scala.inline
    implicit class TabulatorMutableBuilder[Self <: Tabulator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultShowAttribute(value: String): Self = StObject.set(x, "defaultShowAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToHtmlTable(value: js.Object => js.Any): Self = StObject.set(x, "toHtmlTable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToMatrix(value: js.Object => js.Object): Self = StObject.set(x, "toMatrix", js.Any.fromFunction1(value))
    }
  }
}
