package typings.tsDashMockito

import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/ArgsToMatchersValidator", JSImport.Namespace)
@js.native
object libMatcherArgsToMatchersValidatorMod extends js.Object {
  @js.native
  class ArgsToMatchersValidator () extends js.Object {
    def validate(matchers: js.Array[Matcher], args: js.Array[_]): Boolean = js.native
  }
  
}

