package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/ArgsToMatchersValidator", JSImport.Namespace)
@js.native
object argsToMatchersValidatorMod extends js.Object {
  @js.native
  class ArgsToMatchersValidator () extends js.Object {
    def validate(matchers: js.Array[Matcher], args: js.Array[_]): Boolean = js.native
  }
  
}

