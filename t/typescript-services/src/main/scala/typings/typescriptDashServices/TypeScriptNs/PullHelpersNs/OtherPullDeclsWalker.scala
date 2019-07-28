package typings.typescriptDashServices.TypeScriptNs.PullHelpersNs

import typings.typescriptDashServices.TypeScriptNs.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullHelpers.OtherPullDeclsWalker")
@js.native
class OtherPullDeclsWalker () extends js.Object {
  var currentlyWalkingOtherDecls: js.Any = js.native
  def walkOtherPullDecls(
    currentDecl: PullDecl,
    otherDecls: js.Array[PullDecl],
    callBack: js.Function1[/* otherDecl */ PullDecl, Unit]
  ): Unit = js.native
}

