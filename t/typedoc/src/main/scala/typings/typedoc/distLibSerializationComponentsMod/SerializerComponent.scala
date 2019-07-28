package typings.typedoc.distLibSerializationComponentsMod

import typings.typedoc.distLibSerializationSerializerMod.Serializer
import typings.typedoc.distLibUtilsMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/components", "SerializerComponent")
@js.native
abstract class SerializerComponent[T] () extends AbstractComponent[Serializer] {
  val priority: Double = js.native
  var serializeGroupSymbol: js.Any = js.native
  def serializeGroup(instance: js.Any): Boolean = js.native
  def supports(item: js.Any): Boolean = js.native
  def toObject(item: T): js.Any = js.native
  def toObject(item: T, obj: js.Any): js.Any = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/serialization/components", "SerializerComponent")
@js.native
object SerializerComponent extends js.Object {
  var PRIORITY: Double = js.native
}

