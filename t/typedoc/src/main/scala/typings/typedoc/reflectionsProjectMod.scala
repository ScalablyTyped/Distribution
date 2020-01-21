package typings.typedoc

import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/project", JSImport.Namespace)
@js.native
object reflectionsProjectMod extends js.Object {
  @js.native
  class ProjectReflectionSerializer () extends ReflectionSerializerComponent[ProjectReflection]
  
  /* static members */
  @js.native
  object ProjectReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

