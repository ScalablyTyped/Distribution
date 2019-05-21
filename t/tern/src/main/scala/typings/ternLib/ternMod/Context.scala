package typings
package ternLib.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Context")
@js.native
class ContextCls protected ()
  extends ternLib.libInferMod.Context {
  def this(defs: js.Array[_], parent: ternLib.libTernMod.Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: ternLib.libInferMod.Prim with ternLib.Anon_Bool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: ternLib.libInferMod.Prim with ternLib.Anon_Name = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: ternLib.libInferMod.Prim with ternLib.Anon_NameString = js.native
  /* CompleteClass */
  override var topScope: ternLib.libInferMod.Scope = js.native
}

