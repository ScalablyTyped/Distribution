package typings.typedoc

import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibSerializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/abstract", JSImport.Namespace)
@js.native
object distLibSerializationSerializersReflectionsAbstractMod extends js.Object {
  @js.native
  class ReflectionSerializer () extends ReflectionSerializerComponent[Reflection]
  
  /* static members */
  @js.native
  object ReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

