package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betweenMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/BetweenMatcher", "BetweenMatcher")
  @js.native
  class BetweenMatcher protected () extends Matcher {
    def this(min: Double, max: Double) = this()
    
    var max: js.Any = js.native
    
    var min: js.Any = js.native
  }
}
