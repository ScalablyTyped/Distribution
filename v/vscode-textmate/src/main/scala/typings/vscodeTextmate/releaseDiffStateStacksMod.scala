package typings.vscodeTextmate

import typings.vscodeTextmate.mod.StateStack
import typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackFrame
import typings.vscodeTextmate.releaseGrammarMod.StateStackImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseDiffStateStacksMod {
  
  @JSImport("vscode-textmate/release/diffStateStacks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyStateStackDiff(stack: Null, diff: StackDiff): StateStackImpl | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStateStackDiff")(stack.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[StateStackImpl | Null]
  inline def applyStateStackDiff(stack: StateStack, diff: StackDiff): StateStackImpl | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStateStackDiff")(stack.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[StateStackImpl | Null]
  
  inline def diffStateStacksRefEq(first: StateStack, second: StateStack): StackDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStateStacksRefEq")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[StackDiff]
  
  trait StackDiff extends StObject {
    
    val newFrames: js.Array[StateStackFrame]
    
    val pops: Double
  }
  object StackDiff {
    
    inline def apply(newFrames: js.Array[StateStackFrame], pops: Double): StackDiff = {
      val __obj = js.Dynamic.literal(newFrames = newFrames.asInstanceOf[js.Any], pops = pops.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackDiff]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackDiff] (val x: Self) extends AnyVal {
      
      inline def setNewFrames(value: js.Array[StateStackFrame]): Self = StObject.set(x, "newFrames", value.asInstanceOf[js.Any])
      
      inline def setNewFramesVarargs(value: StateStackFrame*): Self = StObject.set(x, "newFrames", js.Array(value*))
      
      inline def setPops(value: Double): Self = StObject.set(x, "pops", value.asInstanceOf[js.Any])
    }
  }
}
