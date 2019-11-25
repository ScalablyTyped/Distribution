package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindNameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// interface
//
@js.native
trait Interface[T] extends Type[T] {
  @JSName("meta")
  var meta_Interface: Anon_IdentityKindNameProps = js.native
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

@JSImport("tcomb", "interface")
@js.native
object interface extends js.Object {
  def apply[T](props: StructProps): Interface[T] = js.native
  def apply[T](props: StructProps, name: java.lang.String): Interface[T] = js.native
  def apply[T](props: StructProps, name: StructOptions): Interface[T] = js.native
}

