package typings.typedoc.distLibOutputUtilsResourcesTemplatesMod

import typings.handlebars.HandlebarsNs.TemplateDelegate
import typings.typedoc.distLibOutputUtilsResourcesStackMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/templates", "Template")
@js.native
class Template[T] () extends Resource {
  var template: js.UndefOr[js.Any] = js.native
  def getTemplate(): TemplateDelegate[T] = js.native
  def render(context: js.Any): String = js.native
  def render(context: js.Any, options: js.Any): String = js.native
}

