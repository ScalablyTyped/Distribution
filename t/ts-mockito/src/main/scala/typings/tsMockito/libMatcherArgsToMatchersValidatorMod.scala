package typings.tsMockito

import typings.tsMockito.libMatcherTypeMatcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatcherArgsToMatchersValidatorMod {
  
  @JSImport("ts-mockito/lib/matcher/ArgsToMatchersValidator", "ArgsToMatchersValidator")
  @js.native
  open class ArgsToMatchersValidator () extends StObject {
    
    def validate(matchers: js.Array[Matcher], args: js.Array[Any]): Boolean = js.native
  }
}
