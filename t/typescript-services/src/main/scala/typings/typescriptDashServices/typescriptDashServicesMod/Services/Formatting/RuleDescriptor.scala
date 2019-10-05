package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange
import typings.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor {
  def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  def create1(left: SyntaxKind, right: SyntaxKind): typings.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create2(left: TokenRange, right: SyntaxKind): typings.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create3(left: SyntaxKind, right: TokenRange): typings.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create4(left: TokenRange, right: TokenRange): typings.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
}

