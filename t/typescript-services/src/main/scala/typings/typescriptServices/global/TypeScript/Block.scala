package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IASTSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Block")
@js.native
class Block protected ()
  extends typings.typescriptServices.TypeScript.Block {
  def this(
    statements: typings.typescriptServices.TypeScript.ISyntaxList2,
    closeBraceLeadingComments: js.Array[typings.typescriptServices.TypeScript.Comment],
    closeBraceToken: IASTSpan
  ) = this()
}

