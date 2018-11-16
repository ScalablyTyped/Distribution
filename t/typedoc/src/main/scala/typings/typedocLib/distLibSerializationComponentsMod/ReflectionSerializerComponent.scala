package typings
package typedocLib.distLibSerializationComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/components", "ReflectionSerializerComponent")
@js.native
abstract class ReflectionSerializerComponent[T /* <: typedocLib.distLibModelsMod.Reflection */] () extends SerializerComponent[T] {
  var serializeGroup: js.Any = js.native
}

@JSImport("typedoc/dist/lib/serialization/components", "ReflectionSerializerComponent")
@js.native
object ReflectionSerializerComponent extends js.Object {
  /* protected */ def serializeGroup(instance: js.Any): scala.Boolean = js.native
}

