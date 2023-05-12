package typings.vscodeTextmate

import typings.vscodeTextmate.vscodeTextmateInts.`-1`
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import typings.vscodeTextmate.vscodeTextmateInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseMatcherMod {
  
  @JSImport("vscode-textmate/release/matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMatchers[T](
    selector: String,
    matchesName: js.Function2[/* names */ js.Array[String], /* matcherInput */ T, Boolean]
  ): js.Array[MatcherWithPriority[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchers")(selector.asInstanceOf[js.Any], matchesName.asInstanceOf[js.Any])).asInstanceOf[js.Array[MatcherWithPriority[T]]]
  
  type Matcher[T] = js.Function1[/* matcherInput */ T, Boolean]
  
  trait MatcherWithPriority[T] extends StObject {
    
    def matcher(matcherInput: T): Boolean
    @JSName("matcher")
    var matcher_Original: Matcher[T]
    
    var priority: `-1` | `0` | `1`
  }
  object MatcherWithPriority {
    
    inline def apply[T](matcher: T => Boolean, priority: `-1` | `0` | `1`): MatcherWithPriority[T] = {
      val __obj = js.Dynamic.literal(matcher = js.Any.fromFunction1(matcher), priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatcherWithPriority[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatcherWithPriority[?], T] (val x: Self & MatcherWithPriority[T]) extends AnyVal {
      
      inline def setMatcher(value: T => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setPriority(value: `-1` | `0` | `1`): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
}
