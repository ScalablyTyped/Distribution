package typings.tern.ternMod

import typings.tern.Anon_Bool
import typings.tern.Anon_Name
import typings.tern.Anon_NameString
import typings.tern.libInferMod.Context
import typings.tern.libInferMod.Prim
import typings.tern.libInferMod.Scope
import typings.tern.libTernMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Context")
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

