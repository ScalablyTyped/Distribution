package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PositionedNodeOrToken")
@js.native
class PositionedNodeOrToken protected ()
  extends typings.typescriptServices.TypeScript.PositionedNodeOrToken {
  def this(
    parent: typings.typescriptServices.TypeScript.PositionedElement,
    nodeOrToken: ISyntaxNodeOrToken,
    fullStart: Double
  ) = this()
}
