package typings.yaml.typesMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Map
import typings.yaml.typesMod.AST.NodeToJsonContext
import typings.yaml.typesMod.Pair.Type.MERGE_PAIR
import typings.yaml.typesMod.Pair.Type.PAIR
import typings.yaml.typesMod.Schema.StringifyContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/types", "Pair")
@js.native
class Pair protected () extends Node {
  def this(key: js.Any) = this()
  def this(key: js.Any, value: js.Any) = this()
  @JSName("cstNode")
  var cstNode_Pair: js.UndefOr[scala.Nothing] = js.native
  /** Always Node or null when parsed, but can be set to anything. */
  var key: js.Any = js.native
  @JSName("type")
  var type_Pair: PAIR | MERGE_PAIR = js.native
  /** Always Node or null when parsed, but can be set to anything. */
  var value: js.Any = js.native
  def toJSON(arg: js.UndefOr[scala.Nothing], ctx: NodeToJsonContext): js.Object | (Map[_, _]) = js.native
  def toJSON(arg: js.Any, ctx: NodeToJsonContext): js.Object | (Map[_, _]) = js.native
  def toString(
    ctx: js.UndefOr[scala.Nothing],
    onComment: js.UndefOr[scala.Nothing],
    onChompKeep: js.Function0[Unit]
  ): String = js.native
  def toString(ctx: js.UndefOr[scala.Nothing], onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: js.UndefOr[scala.Nothing], onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext): String = js.native
  def toString(ctx: StringifyContext, onComment: js.UndefOr[scala.Nothing], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
}

@JSImport("yaml/types", "Pair")
@js.native
object Pair extends js.Object {
  @js.native
  sealed trait Type extends js.Object
  
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait MERGE_PAIR extends Type
    
    @js.native
    sealed trait PAIR extends Type
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type with String] = js.native
    /* "MERGE_PAIR" */ @js.native
    object MERGE_PAIR extends TopLevel[MERGE_PAIR with String]
    
    /* "PAIR" */ @js.native
    object PAIR extends TopLevel[PAIR with String]
    
  }
  
}

