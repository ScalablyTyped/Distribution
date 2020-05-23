package typings.yaml.typesMod

import typings.yaml.typesMod.AST.NodeToJsonContext
import typings.yaml.typesMod.Schema.StringifyContext
import typings.yaml.utilMod.Type.FLOW_SEQ
import typings.yaml.utilMod.Type.SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/types", "YAMLSeq")
@js.native
class YAMLSeq () extends Collection {
  @JSName("type")
  var type_YAMLSeq: js.UndefOr[FLOW_SEQ | SEQ] = js.native
  def delete(key: String): Boolean = js.native
  def delete(key: Double): Boolean = js.native
  def delete(key: Scalar): Boolean = js.native
  def get(key: String): js.Any = js.native
  def get(key: String, keepScalar: Boolean): js.Any = js.native
  def get(key: Double): js.Any = js.native
  def get(key: Double, keepScalar: Boolean): js.Any = js.native
  def get(key: Scalar): js.Any = js.native
  def get(key: Scalar, keepScalar: Boolean): js.Any = js.native
  def has(key: String): Boolean = js.native
  def has(key: Double): Boolean = js.native
  def has(key: Scalar): Boolean = js.native
  def hasAllNullValues(): Boolean = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: Double, value: js.Any): Unit = js.native
  def set(key: Scalar, value: js.Any): Unit = js.native
  def toJSON(arg: js.Any, ctx: NodeToJsonContext): js.Array[_] = js.native
  def toString(ctx: StringifyContext): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
}

