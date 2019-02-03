package typings
package typedocLib.distLibOutputEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/events", "RendererEvent")
@js.native
class RendererEvent protected ()
  extends typedocLib.distLibUtilsEventsMod.Event {
  def this(name: java.lang.String, outputDirectory: java.lang.String, project: typedocLib.distLibModelsReflectionsProjectMod.ProjectReflection) = this()
  val outputDirectory: java.lang.String = js.native
  val project: typedocLib.distLibModelsReflectionsProjectMod.ProjectReflection = js.native
  var settings: js.Any = js.native
  var urls: js.UndefOr[js.Array[typedocLib.distLibOutputModelsUrlMappingMod.UrlMapping]] = js.native
  def createPageEvent(mapping: typedocLib.distLibOutputModelsUrlMappingMod.UrlMapping): PageEvent = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/events", "RendererEvent")
@js.native
object RendererEvent extends js.Object {
  var BEGIN: java.lang.String = js.native
  var END: java.lang.String = js.native
}

