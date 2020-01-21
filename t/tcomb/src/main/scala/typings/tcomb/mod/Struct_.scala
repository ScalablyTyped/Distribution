package typings.tcomb.mod

import org.scalablytyped.runtime.Instantiable1
import typings.tcomb.AnonDefaultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Struct_[T]
  extends Type[T]
     with Instantiable1[/* value */ T, T] {
  @JSName("meta")
  var meta_Struct_ : AnonDefaultProps = js.native
  @JSName("update")
  var update_Original: Update_[T] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin]): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: java.lang.String): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: StructOptions): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: java.lang.String): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: StructOptions): Struct_[E] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

