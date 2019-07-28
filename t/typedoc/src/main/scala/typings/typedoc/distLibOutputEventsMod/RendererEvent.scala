package typings.typedoc.distLibOutputEventsMod

import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typings.typedoc.distLibUtilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/events", "RendererEvent")
@js.native
class RendererEvent protected () extends Event {
  def this(name: String, outputDirectory: String, project: ProjectReflection) = this()
  val outputDirectory: String = js.native
  val project: ProjectReflection = js.native
  var settings: js.Any = js.native
  var urls: js.UndefOr[js.Array[UrlMapping]] = js.native
  def createPageEvent(mapping: UrlMapping): PageEvent = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/events", "RendererEvent")
@js.native
object RendererEvent extends js.Object {
  var BEGIN: String = js.native
  var END: String = js.native
}

