package typings.typedoc

import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.schemaMod.ContainerReflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/project", JSImport.Namespace)
@js.native
object reflectionsProjectMod extends js.Object {
  
  @js.native
  class ProjectReflectionSerializer () extends ReflectionSerializerComponent[ProjectReflection] {
    
    def toObject(container: ProjectReflection, obj: ContainerReflection): typings.typedoc.schemaMod.ProjectReflection = js.native
  }
  /* static members */
  @js.native
  object ProjectReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
}
