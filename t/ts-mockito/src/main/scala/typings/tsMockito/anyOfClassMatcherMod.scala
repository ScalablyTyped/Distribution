package typings.tsMockito

import org.scalablytyped.runtime.Instantiable1
import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyOfClassMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/AnyOfClassMatcher", "AnyOfClassMatcher")
  @js.native
  class AnyOfClassMatcher[T] protected () extends Matcher {
    def this(expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]) = this()
    
    var expectedClass: js.Any = js.native
  }
}
