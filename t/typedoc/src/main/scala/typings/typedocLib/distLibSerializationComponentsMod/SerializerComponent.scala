package typings
package typedocLib.distLibSerializationComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/components", "SerializerComponent")
@js.native
abstract class SerializerComponent[T] ()
  extends typedocLib.distLibUtilsMod.AbstractComponent[typedocLib.distLibSerializationSerializerMod.Serializer] {
  val priority: scala.Double = js.native
  var serializeGroupSymbol: js.Any = js.native
  def serializeGroup(instance: scala.Boolean): scala.Boolean = js.native
  def supports(item: T): scala.Boolean = js.native
  def toObject(item: T): js.Any = js.native
  def toObject(item: T, obj: js.Any): js.Any = js.native
}

@JSImport("typedoc/dist/lib/serialization/components", "SerializerComponent")
@js.native
object SerializerComponent extends js.Object {
  var PRIORITY: scala.Double = js.native
}

