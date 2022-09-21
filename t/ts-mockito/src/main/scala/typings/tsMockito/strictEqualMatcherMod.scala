package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictEqualMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/StrictEqualMatcher", "StrictEqualMatcher")
  @js.native
  open class StrictEqualMatcher protected () extends Matcher {
    def this(expectedValue: Any) = this()
    
    /* private */ var expectedValue: Any = js.native
  }
}
