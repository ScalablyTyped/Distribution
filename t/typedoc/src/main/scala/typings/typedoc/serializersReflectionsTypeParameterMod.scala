package typings.typedoc

import typings.typedoc.modelsMod.TypeParameterReflection
import typings.typedoc.schemaMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsTypeParameterMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/type-parameter", "TypeParameterReflectionSerializer")
  @js.native
  class TypeParameterReflectionSerializer protected () extends ReflectionSerializerComponent[TypeParameterReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(typeParameter: TypeParameterReflection, obj: Reflection): typings.typedoc.schemaMod.TypeParameterReflection = js.native
  }
}
