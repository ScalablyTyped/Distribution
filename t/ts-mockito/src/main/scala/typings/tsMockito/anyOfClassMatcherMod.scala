package typings.tsMockito

import org.scalablytyped.runtime.Instantiable1
import typings.tsMockito.matcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/AnyOfClassMatcher", JSImport.Namespace)
@js.native
object anyOfClassMatcherMod extends js.Object {
  @js.native
  class AnyOfClassMatcher[T] protected () extends Matcher {
    def this(expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]) = this()
    var expectedClass: js.Any = js.native
  }
  
}

