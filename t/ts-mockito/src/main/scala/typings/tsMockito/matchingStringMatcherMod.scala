package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchingStringMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/MatchingStringMatcher", "MatchingStringMatcher")
  @js.native
  class MatchingStringMatcher protected () extends Matcher {
    def this(expectedValue: js.Any) = this()
    
    var expectedValue: js.Any = js.native
  }
}
