package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PositionedSkippedToken")
@js.native
class PositionedSkippedToken protected ()
  extends typings.typescriptServices.TypeScript.PositionedSkippedToken {
  def this(
    parentToken: typings.typescriptServices.TypeScript.PositionedToken,
    token: ISyntaxToken,
    fullStart: Double
  ) = this()
}
