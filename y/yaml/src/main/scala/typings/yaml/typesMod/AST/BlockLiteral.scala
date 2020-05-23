package typings.yaml.typesMod.AST

import typings.yaml.typesMod.Scalar
import typings.yaml.utilMod.Type.BLOCK_LITERAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockLiteral extends Scalar {
  @JSName("cstNode")
  var cstNode_BlockLiteral: js.UndefOr[typings.yaml.parseCstMod.CST.BlockLiteral] = js.native
  @JSName("type")
  var type_BlockLiteral: BLOCK_LITERAL = js.native
}

