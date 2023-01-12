package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeItemLabel extends StObject {
  
  /**
    * Ranges in the label to highlight. A range is defined as a tuple of two number where the
    * first is the inclusive start index and the second the exclusive end index
    */
  var highlights: js.UndefOr[js.Array[js.Tuple2[Double, Double]]] = js.undefined
  
  /**
    * A human-readable string describing the {@link TreeItem Tree item}.
    */
  var label: String
}
object TreeItemLabel {
  
  inline def apply(label: String): TreeItemLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItemLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeItemLabel] (val x: Self) extends AnyVal {
    
    inline def setHighlights(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    inline def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    inline def setHighlightsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "highlights", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
