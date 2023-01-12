package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single disassembled instruction. */
trait DisassembledInstruction extends StObject {
  
  /** The address of the instruction. Treated as a hex value if prefixed with `0x`, or as a decimal value otherwise. */
  var address: String
  
  /** The column within the line that corresponds to this instruction, if any. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The end column of the range that corresponds to this instruction, if any. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** The end line of the range that corresponds to this instruction, if any. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** Text representing the instruction and its operands, in an implementation-defined format. */
  var instruction: String
  
  /** Raw bytes representing the instruction and its operands, in an implementation-defined format. */
  var instructionBytes: js.UndefOr[String] = js.undefined
  
  /** The line within the source location that corresponds to this instruction, if any. */
  var line: js.UndefOr[Double] = js.undefined
  
  /** Source location that corresponds to this instruction, if any.
  			Should always be set (if available) on the first instruction returned,
  			but can be omitted afterwards if this instruction maps to the same source file as the previous instruction.
  		*/
  var location: js.UndefOr[Source] = js.undefined
  
  /** Name of the symbol that corresponds with the location of this instruction, if any. */
  var symbol: js.UndefOr[String] = js.undefined
}
object DisassembledInstruction {
  
  inline def apply(address: String, instruction: String): DisassembledInstruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassembledInstruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassembledInstruction] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionBytes(value: String): Self = StObject.set(x, "instructionBytes", value.asInstanceOf[js.Any])
    
    inline def setInstructionBytesUndefined: Self = StObject.set(x, "instructionBytes", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLocation(value: Source): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
