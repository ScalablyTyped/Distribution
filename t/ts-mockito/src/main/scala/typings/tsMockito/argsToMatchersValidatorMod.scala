package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argsToMatchersValidatorMod {
  
  @JSImport("ts-mockito/lib/matcher/ArgsToMatchersValidator", "ArgsToMatchersValidator")
  @js.native
  class ArgsToMatchersValidator () extends StObject {
    
    def validate(matchers: js.Array[Matcher], args: js.Array[_]): Boolean = js.native
  }
}
