package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected ()
  extends typings.typescriptServices.TypeScript.SyntaxInformationMap {
  def this(trackParents: Boolean, trackPreviousToken: Boolean) = this()
}
object SyntaxInformationMap {
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxInformationMap.create")
  @js.native
  def create(
    node: typings.typescriptServices.TypeScript.SyntaxNode,
    trackParents: Boolean,
    trackPreviousToken: Boolean
  ): typings.typescriptServices.TypeScript.SyntaxInformationMap = js.native
}
