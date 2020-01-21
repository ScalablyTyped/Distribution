package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/MatchingStringMatcher", JSImport.Namespace)
@js.native
object matchingStringMatcherMod extends js.Object {
  @js.native
  class MatchingStringMatcher protected () extends Matcher {
    def this(expectedValue: js.Any) = this()
    var expectedValue: js.Any = js.native
  }
  
}

