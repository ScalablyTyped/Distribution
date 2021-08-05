package typings.vegaLite.anon

import typings.vegaLite.logicalMod.LogicalComposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  /**
    * A [selection name](https://vega.github.io/vega-lite/docs/selection.html), or a series of [composed selections](https://vega.github.io/vega-lite/docs/selection.html#compose).
    */
  var selection: LogicalComposition[String]
}
object Selection {
  
  inline def apply(selection: LogicalComposition[String]): Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setSelection(value: LogicalComposition[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
