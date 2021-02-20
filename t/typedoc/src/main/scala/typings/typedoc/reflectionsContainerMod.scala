package typings.typedoc

import typings.typedoc.modelsMod.ContainerReflection
import typings.typedoc.schemaMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsContainerMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/container", "ContainerReflectionSerializer")
  @js.native
  class ContainerReflectionSerializer protected () extends ReflectionSerializerComponent[ContainerReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(container: ContainerReflection, obj: Reflection): typings.typedoc.schemaMod.ContainerReflection = js.native
  }
}
