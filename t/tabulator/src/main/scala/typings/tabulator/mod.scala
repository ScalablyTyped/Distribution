package typings.tabulator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*~ Write your module's methods and properties in this class */
  @JSImport("tabulator", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Tabulator {
    
    // myMethod(opts: Tabulator.chartType): number;
    /* CompleteClass */
    var defaultShowAttribute: String = js.native
    
    /* CompleteClass */
    override def toHtmlTable(matrix: js.Object): js.Any = js.native
    
    /* CompleteClass */
    override def toMatrix(datum: js.Object): js.Object = js.native
  }
  
  /*~ Write your module's methods and properties in this class */
  trait Tabulator extends StObject {
    
    // myMethod(opts: Tabulator.chartType): number;
    var defaultShowAttribute: String
    
    def toHtmlTable(matrix: js.Object): js.Any
    
    def toMatrix(datum: js.Object): js.Object
  }
  object Tabulator {
    
    inline def apply(defaultShowAttribute: String, toHtmlTable: js.Object => js.Any, toMatrix: js.Object => js.Object): Tabulator = {
      val __obj = js.Dynamic.literal(defaultShowAttribute = defaultShowAttribute.asInstanceOf[js.Any], toHtmlTable = js.Any.fromFunction1(toHtmlTable), toMatrix = js.Any.fromFunction1(toMatrix))
      __obj.asInstanceOf[Tabulator]
    }
    
    extension [Self <: Tabulator](x: Self) {
      
      inline def setDefaultShowAttribute(value: String): Self = StObject.set(x, "defaultShowAttribute", value.asInstanceOf[js.Any])
      
      inline def setToHtmlTable(value: js.Object => js.Any): Self = StObject.set(x, "toHtmlTable", js.Any.fromFunction1(value))
      
      inline def setToMatrix(value: js.Object => js.Object): Self = StObject.set(x, "toMatrix", js.Any.fromFunction1(value))
    }
  }
}
