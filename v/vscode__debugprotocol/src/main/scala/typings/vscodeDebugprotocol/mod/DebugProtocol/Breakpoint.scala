package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about a Breakpoint created in setBreakpoints, setFunctionBreakpoints, setInstructionBreakpoints, or setDataBreakpoints. */
trait Breakpoint extends StObject {
  
  /** The start column of the actual range covered by the breakpoint. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The end column of the actual range covered by the breakpoint.
  			If no end line is given, then the end column is assumed to be in the start line.
  		*/
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** The end line of the actual range covered by the breakpoint. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** The identifier for the breakpoint. It is needed if breakpoint events are used to update or remove breakpoints. */
  var id: js.UndefOr[Double] = js.undefined
  
  /** A memory reference to where the breakpoint is set. */
  var instructionReference: js.UndefOr[String] = js.undefined
  
  /** The start line of the actual range covered by the breakpoint. */
  var line: js.UndefOr[Double] = js.undefined
  
  /** A message about the state of the breakpoint.
  			This is shown to the user and can be used to explain why a breakpoint could not be verified.
  		*/
  var message: js.UndefOr[String] = js.undefined
  
  /** The offset from the instruction reference.
  			This can be negative.
  		*/
  var offset: js.UndefOr[Double] = js.undefined
  
  /** The source where the breakpoint is located. */
  var source: js.UndefOr[Source] = js.undefined
  
  /** If true, the breakpoint could be set (but not necessarily at the desired location). */
  var verified: Boolean
}
object Breakpoint {
  
  inline def apply(verified: Boolean): Breakpoint = {
    val __obj = js.Dynamic.literal(verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoint]
  }
  
  extension [Self <: Breakpoint](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstructionReference(value: String): Self = StObject.set(x, "instructionReference", value.asInstanceOf[js.Any])
    
    inline def setInstructionReferenceUndefined: Self = StObject.set(x, "instructionReference", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
