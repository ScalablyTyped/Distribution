package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected ()
  extends typescriptDashServicesLib.TypeScriptNs.SyntaxInformationMap {
  def this(trackParents: scala.Boolean, trackPreviousToken: scala.Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
object SyntaxInformationMap extends js.Object {
  def create(
    node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode,
    trackParents: scala.Boolean,
    trackPreviousToken: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.SyntaxInformationMap = js.native
}

