package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PositionedToken")
@js.native
class PositionedToken protected ()
  extends typings.typescriptServices.TypeScript.PositionedToken {
  def this(
    parent: typings.typescriptServices.TypeScript.PositionedElement,
    token: ISyntaxToken,
    fullStart: Double
  ) = this()
}

