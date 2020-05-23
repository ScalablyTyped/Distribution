package typings.typedoc

import typings.typedoc.anon.PartialReflection
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/abstract", JSImport.Namespace)
@js.native
object reflectionsAbstractMod extends js.Object {
  @js.native
  class ReflectionSerializer () extends ReflectionSerializerComponent[Reflection] {
    def toObject(reflection: Reflection, obj: PartialReflection): typings.typedoc.schemaMod.Reflection = js.native
  }
  
  /* static members */
  @js.native
  object ReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

