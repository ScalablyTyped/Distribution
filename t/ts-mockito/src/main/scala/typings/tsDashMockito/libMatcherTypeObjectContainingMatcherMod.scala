package typings.tsDashMockito

import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/ObjectContainingMatcher", JSImport.Namespace)
@js.native
object libMatcherTypeObjectContainingMatcherMod extends js.Object {
  @js.native
  class ObjectContainingMatcher protected () extends Matcher {
    def this(expectedValue: js.Any) = this()
    var expectedValue: js.Any = js.native
    def `match`(value: js.Object): Boolean = js.native
  }
  
}

