package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectContainingMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/ObjectContainingMatcher", "ObjectContainingMatcher")
  @js.native
  class ObjectContainingMatcher protected () extends Matcher {
    def this(expectedValue: js.Any) = this()
    
    var expectedValue: js.Any = js.native
    
    def `match`(value: js.Object): Boolean = js.native
  }
}
