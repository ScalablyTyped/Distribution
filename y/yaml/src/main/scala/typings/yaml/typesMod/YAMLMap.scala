package typings.yaml.typesMod

import typings.std.Map
import typings.yaml.typesMod.AST.NodeToJsonContext
import typings.yaml.typesMod.Schema.StringifyContext
import typings.yaml.utilMod.Type.FLOW_MAP
import typings.yaml.utilMod.Type.MAP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "YAMLMap")
@js.native
class YAMLMap () extends Collection {
  
  def hasAllNullValues(): Boolean = js.native
  
  @JSName("items")
  var items_YAMLMap: js.Array[Pair] = js.native
  
  def toJSON(arg: js.Any, ctx: NodeToJsonContext): js.Object | (Map[js.Any, js.Any]) = js.native
  def toJSON(arg: Unit, ctx: NodeToJsonContext): js.Object | (Map[js.Any, js.Any]) = js.native
  
  def toString(ctx: Unit, onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: Unit, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: Unit, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
  
  @JSName("type")
  var type_YAMLMap: js.UndefOr[FLOW_MAP | MAP] = js.native
}
