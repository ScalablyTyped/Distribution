package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.DisassembledInstruction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instructions extends StObject {
  
  /** The list of disassembled instructions. */
  var instructions: js.Array[DisassembledInstruction]
}
object Instructions {
  
  inline def apply(instructions: js.Array[DisassembledInstruction]): Instructions = {
    val __obj = js.Dynamic.literal(instructions = instructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instructions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instructions] (val x: Self) extends AnyVal {
    
    inline def setInstructions(value: js.Array[DisassembledInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsVarargs(value: DisassembledInstruction*): Self = StObject.set(x, "instructions", js.Array(value*))
  }
}
