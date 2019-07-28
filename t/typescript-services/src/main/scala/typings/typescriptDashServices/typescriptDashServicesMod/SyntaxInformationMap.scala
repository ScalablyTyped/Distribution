package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected ()
  extends typings.typescriptDashServices.TypeScriptNs.SyntaxInformationMap {
  def this(trackParents: Boolean, trackPreviousToken: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
object SyntaxInformationMap extends js.Object {
  def create(
    node: typings.typescriptDashServices.TypeScriptNs.SyntaxNode,
    trackParents: Boolean,
    trackPreviousToken: Boolean
  ): typings.typescriptDashServices.TypeScriptNs.SyntaxInformationMap = js.native
}

