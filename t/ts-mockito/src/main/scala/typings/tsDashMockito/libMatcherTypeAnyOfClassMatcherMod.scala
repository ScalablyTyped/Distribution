package typings.tsDashMockito

import org.scalablytyped.runtime.Instantiable1
import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/AnyOfClassMatcher", JSImport.Namespace)
@js.native
object libMatcherTypeAnyOfClassMatcherMod extends js.Object {
  @js.native
  class AnyOfClassMatcher[T] protected () extends Matcher {
    def this(expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]) = this()
    var expectedClass: js.Any = js.native
  }
  
}

