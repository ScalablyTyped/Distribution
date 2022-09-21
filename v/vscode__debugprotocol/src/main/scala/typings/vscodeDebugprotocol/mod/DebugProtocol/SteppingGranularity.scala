package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
		'statement': The step should allow the program to run until the current statement has finished executing.
		The meaning of a statement is determined by the adapter and it may be considered equivalent to a line.
		For example 'for(int i = 0; i < 10; i++)' could be considered to have 3 statements 'int i = 0', 'i < 10', and 'i++'.
		'line': The step should allow the program to run until the current source line has executed.
		'instruction': The step should allow one instruction to execute (e.g. one x86 instruction).
	*/
/* Rewritten from type alias, can be one of: 
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.statement
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.line
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.instruction
*/
trait SteppingGranularity extends StObject
object SteppingGranularity {
  
  inline def instruction: typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.instruction = "instruction".asInstanceOf[typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.instruction]
  
  inline def line: typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.line = "line".asInstanceOf[typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.line]
  
  inline def statement: typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.statement = "statement".asInstanceOf[typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.statement]
}
