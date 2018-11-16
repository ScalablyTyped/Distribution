package typings
package typescriptDashServicesLib.TypeScriptNs.PullHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullHelpers.OtherPullDeclsWalker")
@js.native
class OtherPullDeclsWalker () extends js.Object {
  var currentlyWalkingOtherDecls: js.Any = js.native
  def walkOtherPullDecls(
    currentDecl: typescriptDashServicesLib.TypeScriptNs.PullDecl,
    otherDecls: js.Array[typescriptDashServicesLib.TypeScriptNs.PullDecl],
    callBack: js.Function1[/* otherDecl */ typescriptDashServicesLib.TypeScriptNs.PullDecl, scala.Unit]
  ): scala.Unit = js.native
}

