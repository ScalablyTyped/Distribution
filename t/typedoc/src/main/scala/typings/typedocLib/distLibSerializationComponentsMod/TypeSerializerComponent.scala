package typings
package typedocLib.distLibSerializationComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/components", "TypeSerializerComponent")
@js.native
abstract class TypeSerializerComponent[T /* <: typedocLib.distLibModelsMod.Type */] () extends SerializerComponent[T] {
  var serializeGroup: js.Any = js.native
}

@JSImport("typedoc/dist/lib/serialization/components", "TypeSerializerComponent")
@js.native
object TypeSerializerComponent extends js.Object {
  /* protected */ def serializeGroup(instance: js.Any): scala.Boolean = js.native
}

