package typings
package typedocLib.distLibOutputEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/events", "PageEvent")
@js.native
class PageEvent ()
  extends typedocLib.distLibUtilsEventsMod.Event {
  var contents: js.UndefOr[java.lang.String] = js.native
  var filename: java.lang.String = js.native
  var model: js.Any = js.native
  var navigation: js.UndefOr[typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem] = js.native
  var project: typedocLib.distLibModelsReflectionsProjectMod.ProjectReflection = js.native
  var settings: js.Any = js.native
  var template: js.UndefOr[handlebarsLib.HandlebarsTemplateDelegate[_]] = js.native
  var templateName: java.lang.String = js.native
  var toc: js.UndefOr[typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem] = js.native
  var url: java.lang.String = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/events", "PageEvent")
@js.native
object PageEvent extends js.Object {
  var BEGIN: java.lang.String = js.native
  var END: java.lang.String = js.native
}

