package typings.typedoc

import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibUtilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/events", JSImport.Namespace)
@js.native
object distLibSerializationEventsMod extends js.Object {
  @js.native
  class SerializeEvent protected () extends Event {
    def this(name: String, project: ProjectReflection) = this()
    var output: js.Any = js.native
    var outputDirectory: js.UndefOr[String] = js.native
    var outputFile: js.UndefOr[String] = js.native
    val project: ProjectReflection = js.native
  }
  
}

