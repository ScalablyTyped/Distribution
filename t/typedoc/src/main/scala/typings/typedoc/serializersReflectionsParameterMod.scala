package typings.typedoc

import typings.typedoc.modelsMod.ParameterReflection
import typings.typedoc.schemaMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsParameterMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/parameter", "ParameterReflectionSerializer")
  @js.native
  class ParameterReflectionSerializer protected () extends ReflectionSerializerComponent[ParameterReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(parameter: ParameterReflection, obj: Reflection): typings.typedoc.schemaMod.ParameterReflection = js.native
  }
}
