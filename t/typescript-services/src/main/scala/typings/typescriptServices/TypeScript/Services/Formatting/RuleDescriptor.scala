package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected () extends js.Object {
  def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
  var LeftTokenRange: TokenRange = js.native
  var RightTokenRange: TokenRange = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  def create1(left: SyntaxKind, right: SyntaxKind): RuleDescriptor = js.native
  def create2(left: TokenRange, right: SyntaxKind): RuleDescriptor = js.native
  def create3(left: SyntaxKind, right: TokenRange): RuleDescriptor = js.native
  def create4(left: TokenRange, right: TokenRange): RuleDescriptor = js.native
}

