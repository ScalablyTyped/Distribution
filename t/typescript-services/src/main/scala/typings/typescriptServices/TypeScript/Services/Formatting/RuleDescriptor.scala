package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleDescriptor extends js.Object {
  var LeftTokenRange: TokenRange
  var RightTokenRange: TokenRange
}

object RuleDescriptor {
  @scala.inline
  def apply(LeftTokenRange: TokenRange, RightTokenRange: TokenRange): RuleDescriptor = {
    val __obj = js.Dynamic.literal(LeftTokenRange = LeftTokenRange.asInstanceOf[js.Any], RightTokenRange = RightTokenRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleDescriptor]
  }
}

