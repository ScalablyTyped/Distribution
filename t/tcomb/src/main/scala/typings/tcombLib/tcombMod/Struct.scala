package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Struct[T]
  extends Type[T]
     with org.scalablytyped.runtime.Instantiable1[/* value */ T, T] {
  @JSName("meta")
  var meta_Struct: tcombLib.Anon_DefaultProps = js.native
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

