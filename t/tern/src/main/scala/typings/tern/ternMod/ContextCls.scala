package typings.tern.ternMod

import typings.tern.Anon_Bool
import typings.tern.Anon_Name
import typings.tern.Anon_NameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Context")
@js.native
class ContextCls protected ()
  extends typings.tern.libInferMod.Context {
  def this(defs: js.Array[_], parent: typings.tern.libTernMod.Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: typings.tern.libInferMod.Prim with Anon_Bool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: typings.tern.libInferMod.Prim with Anon_Name = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: typings.tern.libInferMod.Prim with Anon_NameString = js.native
  /* CompleteClass */
  override var topScope: typings.tern.libInferMod.Scope = js.native
}

