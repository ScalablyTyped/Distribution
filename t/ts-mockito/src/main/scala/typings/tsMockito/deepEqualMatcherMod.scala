package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepEqualMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/DeepEqualMatcher", "DeepEqualMatcher")
  @js.native
  class DeepEqualMatcher[T] protected () extends Matcher {
    def this(expectedValue: T) = this()
    
    var expectedValue: js.Any = js.native
  }
}
