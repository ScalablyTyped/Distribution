package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A StepInTarget can be used in the `stepIn` request and determines into which single target the stepIn request should step. */
trait StepInTarget extends StObject {
  
  /** The column of the step in target. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The end column of the range covered by the step in target. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** The end line of the range covered by the step in target. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** Unique identifier for a stepIn target. */
  var id: Double
  
  /** The name of the stepIn target (shown in the UI). */
  var label: String
  
  /** The line of the step in target. */
  var line: js.UndefOr[Double] = js.undefined
}
object StepInTarget {
  
  inline def apply(id: Double, label: String): StepInTarget = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepInTarget] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
