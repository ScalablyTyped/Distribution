package typings.tsDashMockito

import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/DeepEqualMatcher", JSImport.Namespace)
@js.native
object libMatcherTypeDeepEqualMatcherMod extends js.Object {
  @js.native
  class DeepEqualMatcher[T] protected () extends Matcher {
    def this(expectedValue: T) = this()
    var expectedValue: js.Any = js.native
  }
  
}

