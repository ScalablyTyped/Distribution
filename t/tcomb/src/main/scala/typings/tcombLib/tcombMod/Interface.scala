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
  var update_Original: Update[T] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin]): Struct[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: java.lang.String): Struct[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: StructOptions): Struct[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin): Struct[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: java.lang.String): Struct[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: StructOptions): Struct[E] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

