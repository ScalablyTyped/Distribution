package typings.yaml.typesMod

import typings.yaml.typesMod.AST.NodeToJsonContext
import typings.yaml.typesMod.Scalar.Type
import typings.yaml.yamlStrings.BIN
import typings.yaml.yamlStrings.HEX
import typings.yaml.yamlStrings.OCT
import typings.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "Scalar")
@js.native
class Scalar protected () extends Node {
  def this(value: js.Any) = this()
  
  /**
    * By default (undefined), numbers use decimal notation.
    * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
    */
  var format: js.UndefOr[BIN | HEX | OCT | TIME] = js.native
  
  def toJSON(arg: js.UndefOr[scala.Nothing], ctx: NodeToJsonContext): js.Any = js.native
  def toJSON(arg: js.Any, ctx: NodeToJsonContext): js.Any = js.native
  
  @JSName("type")
  var type_Scalar: js.UndefOr[Type] = js.native
  
  var value: js.Any = js.native
}
@JSImport("yaml/types", "Scalar")
@js.native
object Scalar extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.utilMod.Type.BLOCK_FOLDED
    - typings.yaml.utilMod.Type.BLOCK_LITERAL
    - typings.yaml.utilMod.Type.PLAIN
    - typings.yaml.utilMod.Type.QUOTE_DOUBLE
    - typings.yaml.utilMod.Type.QUOTE_SINGLE
  */
  trait Type extends js.Object
}
