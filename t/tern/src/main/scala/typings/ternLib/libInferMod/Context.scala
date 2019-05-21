package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Prim with ternLib.Anon_Bool
  /** The primitive number type. */
  var num: Prim with ternLib.Anon_Name
  var parent: js.UndefOr[ternLib.libTernMod.Server] = js.undefined
  /** The primitive string type. */
  var str: Prim with ternLib.Anon_NameString
  var topScope: Scope
}

@JSImport("tern/lib/infer", "Context")
@js.native
class ContextCls protected () extends Context {
  def this(defs: js.Array[_], parent: ternLib.libTernMod.Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: Prim with ternLib.Anon_Bool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: Prim with ternLib.Anon_Name = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: Prim with ternLib.Anon_NameString = js.native
  /* CompleteClass */
  override var topScope: Scope = js.native
}

object Context {
  @scala.inline
  def apply(
    bool: Prim with ternLib.Anon_Bool,
    num: Prim with ternLib.Anon_Name,
    str: Prim with ternLib.Anon_NameString,
    topScope: Scope,
    parent: ternLib.libTernMod.Server = null
  ): Context = {
    val __obj = js.Dynamic.literal(bool = bool, num = num, str = str, topScope = topScope)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Context]
  }
}

