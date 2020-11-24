package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PositionedToken")
@js.native
class PositionedToken protected ()
  extends typings.typescriptServices.TypeScript.PositionedToken {
  def this(
    parent: typings.typescriptServices.TypeScript.PositionedElement,
    token: ISyntaxToken,
    fullStart: Double
  ) = this()
}
