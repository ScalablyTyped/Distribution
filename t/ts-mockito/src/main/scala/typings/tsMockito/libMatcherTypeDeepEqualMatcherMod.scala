package typings.tsMockito

import typings.tsMockito.libMatcherTypeMatcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatcherTypeDeepEqualMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/DeepEqualMatcher", "DeepEqualMatcher")
  @js.native
  open class DeepEqualMatcher[T] protected () extends Matcher {
    def this(expectedValue: T) = this()
    
    /* private */ var expectedValue: Any = js.native
  }
}
