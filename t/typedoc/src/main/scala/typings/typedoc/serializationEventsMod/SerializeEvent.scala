package typings.typedoc.serializationEventsMod

import typings.typedoc.PartialProjectReflection
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.utilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/events", "SerializeEvent")
@js.native
class SerializeEvent protected () extends Event {
  def this(name: String, project: ProjectReflection, output: PartialProjectReflection) = this()
  var output: PartialProjectReflection = js.native
  var outputDirectory: js.UndefOr[String] = js.native
  var outputFile: js.UndefOr[String] = js.native
  val project: ProjectReflection = js.native
}

