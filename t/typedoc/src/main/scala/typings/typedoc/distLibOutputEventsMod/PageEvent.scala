package typings.typedoc.distLibOutputEventsMod

import typings.handlebars.HandlebarsNs.TemplateDelegate
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typings.typedoc.distLibUtilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/events", "PageEvent")
@js.native
class PageEvent () extends Event {
  var contents: js.UndefOr[String] = js.native
  var filename: String = js.native
  var model: js.Any = js.native
  var navigation: js.UndefOr[NavigationItem] = js.native
  var project: ProjectReflection = js.native
  var settings: js.Any = js.native
  var template: js.UndefOr[TemplateDelegate[_]] = js.native
  var templateName: String = js.native
  var toc: js.UndefOr[NavigationItem] = js.native
  var url: String = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/events", "PageEvent")
@js.native
object PageEvent extends js.Object {
  var BEGIN: String = js.native
  var END: String = js.native
}

