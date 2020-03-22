package typings.typedoc

import typings.typedoc.modelsMod.ReferenceReflection
import typings.typedoc.schemaMod.DeclarationReflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/reference", JSImport.Namespace)
@js.native
object serializersReflectionsReferenceMod extends js.Object {
  @js.native
  class ReferenceReflectionSerializer () extends ReflectionSerializerComponent[ReferenceReflection] {
    def toObject(ref: ReferenceReflection, obj: DeclarationReflection): typings.typedoc.schemaMod.ReferenceReflection = js.native
  }
  
  /* static members */
  @js.native
  object ReferenceReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

