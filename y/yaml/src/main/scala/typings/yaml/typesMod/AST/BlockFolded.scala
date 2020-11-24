package typings.yaml.typesMod.AST

import typings.yaml.typesMod.Scalar
import typings.yaml.utilMod.Type.BLOCK_FOLDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockFolded extends Scalar {
  
  @JSName("cstNode")
  var cstNode_BlockFolded: js.UndefOr[typings.yaml.parseCstMod.CST.BlockFolded] = js.native
  
  @JSName("type")
  var type_BlockFolded: BLOCK_FOLDED = js.native
}
