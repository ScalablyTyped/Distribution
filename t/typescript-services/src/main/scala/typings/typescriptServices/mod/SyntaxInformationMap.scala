package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected ()
  extends typings.typescriptServices.TypeScript.SyntaxInformationMap {
  def this(trackParents: Boolean, trackPreviousToken: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
object SyntaxInformationMap extends js.Object {
  def create(
    node: typings.typescriptServices.TypeScript.SyntaxNode,
    trackParents: Boolean,
    trackPreviousToken: Boolean
  ): typings.typescriptServices.TypeScript.SyntaxInformationMap = js.native
}

