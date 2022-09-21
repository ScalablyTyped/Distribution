package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A GotoTarget describes a code location that can be used as a target in the `goto` request.
		The possible goto targets can be determined via the `gotoTargets` request.
	*/
trait GotoTarget extends StObject {
  
  /** The column of the goto target. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The end column of the range covered by the goto target. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** The end line of the range covered by the goto target. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** Unique identifier for a goto target. This is used in the goto request. */
  var id: Double
  
  /** A memory reference for the instruction pointer value represented by this target. */
  var instructionPointerReference: js.UndefOr[String] = js.undefined
  
  /** The name of the goto target (shown in the UI). */
  var label: String
  
  /** The line of the goto target. */
  var line: Double
}
object GotoTarget {
  
  inline def apply(id: Double, label: String, line: Double): GotoTarget = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoTarget]
  }
  
  extension [Self <: GotoTarget](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstructionPointerReference(value: String): Self = StObject.set(x, "instructionPointerReference", value.asInstanceOf[js.Any])
    
    inline def setInstructionPointerReferenceUndefined: Self = StObject.set(x, "instructionPointerReference", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
