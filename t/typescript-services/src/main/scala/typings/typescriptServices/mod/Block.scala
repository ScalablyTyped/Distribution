package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IASTSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Block")
@js.native
class Block protected ()
  extends typings.typescriptServices.TypeScript.Block {
  def this(
    statements: typings.typescriptServices.TypeScript.ISyntaxList2,
    closeBraceLeadingComments: js.Array[typings.typescriptServices.TypeScript.Comment],
    closeBraceToken: IASTSpan
  ) = this()
}

