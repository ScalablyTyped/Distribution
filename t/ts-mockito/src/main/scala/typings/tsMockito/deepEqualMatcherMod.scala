package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/DeepEqualMatcher", JSImport.Namespace)
@js.native
object deepEqualMatcherMod extends js.Object {
  @js.native
  class DeepEqualMatcher[T] protected () extends Matcher {
    def this(expectedValue: T) = this()
    var expectedValue: js.Any = js.native
  }
  
}

