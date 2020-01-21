package typings.typedoc

import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.utilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/events", JSImport.Namespace)
@js.native
object serializationEventsMod extends js.Object {
  @js.native
  class SerializeEvent protected () extends Event {
    def this(name: String, project: ProjectReflection) = this()
    var output: js.Any = js.native
    var outputDirectory: js.UndefOr[String] = js.native
    var outputFile: js.UndefOr[String] = js.native
    val project: ProjectReflection = js.native
  }
  
}

