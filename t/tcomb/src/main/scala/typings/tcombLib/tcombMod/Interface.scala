package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// interface
//
@js.native
trait Interface[T] extends Type[T] {
  @JSName("meta")
  var meta_Interface: tcombLib.Anon_IdentityKindNameProps = js.native
  @JSName("update")
  var update_Original: tcombLib.Update[T] = js.native
  def extend[E /* <: T */](mixins: js.Array[tcombLib.StructMixin]): Struct[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[tcombLib.StructMixin], name: java.lang.String): Struct[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[tcombLib.StructMixin], name: tcombLib.StructOptions): Struct[E] = js.native
  def extend[E /* <: T */](mixins: tcombLib.StructMixin): Struct[E] = js.native
  def extend[E /* <: T */](mixins: tcombLib.StructMixin, name: java.lang.String): Struct[E] = js.native
  def extend[E /* <: T */](mixins: tcombLib.StructMixin, name: tcombLib.StructOptions): Struct[E] = js.native
  def update(instance: T, spec: tcombLib.UpdatePatch): T = js.native
}

