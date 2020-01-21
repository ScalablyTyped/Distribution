package typings.tern.mod

import typings.tern.AnonBool
import typings.tern.AnonName
import typings.tern.AnonNameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Context")
@js.native
class ContextCls protected ()
  extends typings.tern.inferMod.Context {
  def this(defs: js.Array[_], parent: typings.tern.ternMod.Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: typings.tern.inferMod.Prim with AnonBool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: typings.tern.inferMod.Prim with AnonName = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: typings.tern.inferMod.Prim with AnonNameString = js.native
  /* CompleteClass */
  override var topScope: typings.tern.inferMod.Scope = js.native
}

