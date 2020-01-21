package typings.typedoc

import typings.typedoc.applicationMod.Application
import typings.typedoc.libUtilsMod.ChildableComponent
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializer", JSImport.Namespace)
@js.native
object serializerMod extends js.Object {
  @js.native
  class Serializer ()
    extends ChildableComponent[Application, SerializerComponent[js.Any]] {
    var findRoutes: js.Any = js.native
    var router: js.Any = js.native
    var routes: js.Any = js.native
    def projectToObject(value: ProjectReflection): js.Any = js.native
    def projectToObject(value: ProjectReflection, eventData: AnonBegin): js.Any = js.native
    def toObject(value: js.Any): js.Any = js.native
    def toObject(value: js.Any, obj: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Serializer extends js.Object {
    var EVENT_BEGIN: String = js.native
    var EVENT_END: String = js.native
  }
  
}

