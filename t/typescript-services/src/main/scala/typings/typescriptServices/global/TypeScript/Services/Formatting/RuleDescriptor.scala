package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
  def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  def create1(left: SyntaxKind, right: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create2(left: TokenRange, right: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create3(left: SyntaxKind, right: TokenRange): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create4(left: TokenRange, right: TokenRange): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
}

