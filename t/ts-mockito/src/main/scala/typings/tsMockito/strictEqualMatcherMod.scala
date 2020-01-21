package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/StrictEqualMatcher", JSImport.Namespace)
@js.native
object strictEqualMatcherMod extends js.Object {
  @js.native
  class StrictEqualMatcher protected () extends Matcher {
    def this(expectedValue: js.Any) = this()
    var expectedValue: js.Any = js.native
  }
  
}

