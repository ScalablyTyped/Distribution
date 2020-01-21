package typings.tern.inferMod

import typings.tern.AnonBool
import typings.tern.AnonName
import typings.tern.AnonNameString
import typings.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "Context")
@js.native
class ContextCls protected () extends Context {
  def this(defs: js.Array[_], parent: Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: Prim with AnonBool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: Prim with AnonName = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: Prim with AnonNameString = js.native
  /* CompleteClass */
  override var topScope: Scope = js.native
}

