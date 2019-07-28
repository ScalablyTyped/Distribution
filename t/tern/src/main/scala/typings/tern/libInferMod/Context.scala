package typings.tern.libInferMod

import typings.tern.Anon_Bool
import typings.tern.Anon_Name
import typings.tern.Anon_NameString
import typings.tern.libTernMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Prim with Anon_Bool
  /** The primitive number type. */
  var num: Prim with Anon_Name
  var parent: js.UndefOr[Server] = js.undefined
  /** The primitive string type. */
  var str: Prim with Anon_NameString
  var topScope: Scope
}

@JSImport("tern/lib/infer", "Context")
@js.native
class ContextCls protected () extends Context {
  def this(defs: js.Array[_], parent: Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: Prim with Anon_Bool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: Prim with Anon_Name = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: Prim with Anon_NameString = js.native
  /* CompleteClass */
  override var topScope: Scope = js.native
}

object Context {
  @scala.inline
  def apply(
    bool: Prim with Anon_Bool,
    num: Prim with Anon_Name,
    str: Prim with Anon_NameString,
    topScope: Scope,
    parent: Server = null
  ): Context = {
    val __obj = js.Dynamic.literal(bool = bool, num = num, str = str, topScope = topScope)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Context]
  }
}

