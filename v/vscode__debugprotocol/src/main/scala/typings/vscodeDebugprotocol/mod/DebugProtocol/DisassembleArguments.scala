package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `disassemble` request. */
trait DisassembleArguments extends StObject {
  
  /** Number of instructions to disassemble starting at the specified location and offset.
  			An adapter must return exactly this number of instructions - any unavailable instructions should be replaced with an implementation-defined 'invalid instruction' value.
  		*/
  var instructionCount: Double
  
  /** Offset (in instructions) to be applied after the byte offset (if any) before disassembling. Can be negative. */
  var instructionOffset: js.UndefOr[Double] = js.undefined
  
  /** Memory reference to the base location containing the instructions to disassemble. */
  var memoryReference: String
  
  /** Offset (in bytes) to be applied to the reference location before disassembling. Can be negative. */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** If true, the adapter should attempt to resolve memory addresses and other values to symbolic names. */
  var resolveSymbols: js.UndefOr[Boolean] = js.undefined
}
object DisassembleArguments {
  
  inline def apply(instructionCount: Double, memoryReference: String): DisassembleArguments = {
    val __obj = js.Dynamic.literal(instructionCount = instructionCount.asInstanceOf[js.Any], memoryReference = memoryReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassembleArguments]
  }
  
  extension [Self <: DisassembleArguments](x: Self) {
    
    inline def setInstructionCount(value: Double): Self = StObject.set(x, "instructionCount", value.asInstanceOf[js.Any])
    
    inline def setInstructionOffset(value: Double): Self = StObject.set(x, "instructionOffset", value.asInstanceOf[js.Any])
    
    inline def setInstructionOffsetUndefined: Self = StObject.set(x, "instructionOffset", js.undefined)
    
    inline def setMemoryReference(value: String): Self = StObject.set(x, "memoryReference", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setResolveSymbols(value: Boolean): Self = StObject.set(x, "resolveSymbols", value.asInstanceOf[js.Any])
    
    inline def setResolveSymbolsUndefined: Self = StObject.set(x, "resolveSymbols", js.undefined)
  }
}
