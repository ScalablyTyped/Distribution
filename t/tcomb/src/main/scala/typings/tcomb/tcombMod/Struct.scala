package typings.tcomb.tcombMod

import org.scalablytyped.runtime.Instantiable1
import typings.tcomb.Anon_DefaultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Struct[T]
  extends Type[T]
     with Instantiable1[/* value */ T, T] {
  @JSName("meta")
  var meta_Struct: Anon_DefaultProps = js.native
  @JSName("update")
  var update_Original: Update[T] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin]): Struct[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: String): Struct[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: StructOptions): Struct[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin): Struct[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: String): Struct[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: StructOptions): Struct[E] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

