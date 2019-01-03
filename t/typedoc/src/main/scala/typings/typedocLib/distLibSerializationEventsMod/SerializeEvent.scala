package typings
package typedocLib.distLibSerializationEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/events", "SerializeEvent")
@js.native
class SerializeEvent protected ()
  extends typedocLib.distLibUtilsEventsMod.Event {
  def this(name: java.lang.String, project: typedocLib.distLibModelsMod.ProjectReflection) = this()
  var output: js.Any = js.native
  var outputDirectory: js.UndefOr[java.lang.String] = js.native
  var outputFile: js.UndefOr[java.lang.String] = js.native
  val project: typedocLib.distLibModelsMod.ProjectReflection = js.native
}

