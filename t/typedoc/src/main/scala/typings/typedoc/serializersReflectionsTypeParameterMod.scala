package typings.typedoc

import typings.typedoc.modelsMod.TypeParameterReflection
import typings.typedoc.schemaMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/type-parameter", JSImport.Namespace)
@js.native
object serializersReflectionsTypeParameterMod extends js.Object {
  @js.native
  class TypeParameterReflectionSerializer () extends ReflectionSerializerComponent[TypeParameterReflection] {
    def toObject(typeParameter: TypeParameterReflection, obj: Reflection): typings.typedoc.schemaMod.TypeParameterReflection = js.native
  }
  
}

