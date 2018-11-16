package typings
package typedocLib.distLibSerializationSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializer", "Serializer")
@js.native
class Serializer ()
  extends typedocLib.distLibUtilsMod.ChildableComponent[
      typedocLib.distLibApplicationMod.Application, 
      typedocLib.distLibSerializationComponentsMod.SerializerComponent[js.Any]
    ] {
  var findRoutes: js.Any = js.native
  var router: js.Any = js.native
  var routes: js.Any = js.native
  def projectToObject(value: typedocLib.distLibModelsMod.ProjectReflection): js.Any = js.native
  def projectToObject(value: typedocLib.distLibModelsMod.ProjectReflection, eventData: typedocLib.Anon_Begin): js.Any = js.native
  def toObject(value: js.Any): js.Any = js.native
  def toObject(value: js.Any, obj: js.Any): js.Any = js.native
}

@JSImport("typedoc/dist/lib/serialization/serializer", "Serializer")
@js.native
object Serializer extends js.Object {
  var EVENT_BEGIN: java.lang.String = js.native
  var EVENT_END: java.lang.String = js.native
}

