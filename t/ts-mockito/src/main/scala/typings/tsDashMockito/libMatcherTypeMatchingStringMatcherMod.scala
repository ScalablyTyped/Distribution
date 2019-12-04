package typings.tsDashMockito

import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/MatchingStringMatcher", JSImport.Namespace)
@js.native
object libMatcherTypeMatchingStringMatcherMod extends js.Object {
  @js.native
  class MatchingStringMatcher protected () extends Matcher {
    def this(expectedValue: js.Any) = this()
    var expectedValue: js.Any = js.native
  }
  
}

