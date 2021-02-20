package typings.vegaLite.anon

import typings.vegaLite.logicalMod.LogicalComposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selection extends StObject {
  
  /**
    * A [selection name](https://vega.github.io/vega-lite/docs/selection.html), or a series of [composed selections](https://vega.github.io/vega-lite/docs/selection.html#compose).
    */
  var selection: LogicalComposition[String] = js.native
}
object Selection {
  
  @scala.inline
  def apply(selection: LogicalComposition[String]): Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelection(value: LogicalComposition[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
