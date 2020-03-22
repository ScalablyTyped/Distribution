package typings.tern.mod

import typings.tern.Primnamebool
import typings.tern.Primnamenumber
import typings.tern.Primnamestring
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
  override var bool: Primnamebool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: Primnamenumber = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: Primnamestring = js.native
  /* CompleteClass */
  override var topScope: typings.tern.inferMod.Scope = js.native
}

