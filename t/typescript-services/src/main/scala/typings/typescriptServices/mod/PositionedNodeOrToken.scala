package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PositionedNodeOrToken")
@js.native
class PositionedNodeOrToken protected ()
  extends typings.typescriptServices.TypeScript.PositionedNodeOrToken {
  def this(
    parent: typings.typescriptServices.TypeScript.PositionedElement,
    nodeOrToken: ISyntaxNodeOrToken,
    fullStart: Double
  ) = this()
}

