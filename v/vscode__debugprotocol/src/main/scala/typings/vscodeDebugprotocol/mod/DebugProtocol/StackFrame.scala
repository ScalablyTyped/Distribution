package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.label
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.normal
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.subtle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Stackframe contains the source location. */
trait StackFrame extends StObject {
  
  /** Indicates whether this frame can be restarted with the `restart` request. Clients should only use this if the debug adapter supports the `restart` request and the corresponding capability `supportsRestartRequest` is true. */
  var canRestart: js.UndefOr[Boolean] = js.undefined
  
  /** The column within the line. If source attribute is missing or doesn't exist, column is 0 and should be ignored by the client. */
  var column: Double
  
  /** The end column of the range covered by the stack frame. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** The end line of the range covered by the stack frame. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** An identifier for the stack frame. It must be unique across all threads.
  			This id can be used to retrieve the scopes of the frame with the `scopes` request or to restart the execution of a stackframe.
  		*/
  var id: Double
  
  /** A memory reference for the current instruction pointer in this frame. */
  var instructionPointerReference: js.UndefOr[String] = js.undefined
  
  /** The line within the source of the frame. If the source attribute is missing or doesn't exist, line is 0 and should be ignored by the client. */
  var line: Double
  
  /** The module associated with this frame, if any. */
  var moduleId: js.UndefOr[Double | String] = js.undefined
  
  /** The name of the stack frame, typically a method name. */
  var name: String
  
  /** A hint for how to present this frame in the UI.
  			A value of `label` can be used to indicate that the frame is an artificial frame that is used as a visual label or separator. A value of `subtle` can be used to change the appearance of a frame in a 'subtle' way.
  		*/
  var presentationHint: js.UndefOr[normal | label | subtle] = js.undefined
  
  /** The source of the frame. */
  var source: js.UndefOr[Source] = js.undefined
}
object StackFrame {
  
  inline def apply(column: Double, id: Double, line: Double, name: String): StackFrame = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
  
  extension [Self <: StackFrame](x: Self) {
    
    inline def setCanRestart(value: Boolean): Self = StObject.set(x, "canRestart", value.asInstanceOf[js.Any])
    
    inline def setCanRestartUndefined: Self = StObject.set(x, "canRestart", js.undefined)
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstructionPointerReference(value: String): Self = StObject.set(x, "instructionPointerReference", value.asInstanceOf[js.Any])
    
    inline def setInstructionPointerReferenceUndefined: Self = StObject.set(x, "instructionPointerReference", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: Double | String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPresentationHint(value: normal | label | subtle): Self = StObject.set(x, "presentationHint", value.asInstanceOf[js.Any])
    
    inline def setPresentationHintUndefined: Self = StObject.set(x, "presentationHint", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
