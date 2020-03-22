package typings.typedoc

import typings.typedoc.modelsMod.ContainerReflection
import typings.typedoc.schemaMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/container", JSImport.Namespace)
@js.native
object reflectionsContainerMod extends js.Object {
  @js.native
  class ContainerReflectionSerializer () extends ReflectionSerializerComponent[ContainerReflection] {
    def toObject(container: ContainerReflection, obj: Reflection): typings.typedoc.schemaMod.ContainerReflection = js.native
  }
  
}

