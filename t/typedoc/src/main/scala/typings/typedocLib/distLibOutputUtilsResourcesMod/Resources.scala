package typings
package typedocLib.distLibOutputUtilsResourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources", "Resources")
@js.native
class Resources protected () extends js.Object {
  def this(theme: typedocLib.distLibOutputThemeMod.Theme) = this()
  var helpers: typedocLib.distLibOutputUtilsResourcesHelpersMod.HelperStack = js.native
  var isActive: js.Any = js.native
  var layouts: typedocLib.distLibOutputUtilsResourcesTemplatesMod.TemplateStack = js.native
  var partials: typedocLib.distLibOutputUtilsResourcesTemplatesMod.PartialStack = js.native
  var templates: typedocLib.distLibOutputUtilsResourcesTemplatesMod.TemplateStack = js.native
  var theme: js.Any = js.native
  def activate(): scala.Boolean = js.native
  def addDirectory(name: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def deactivate(): scala.Boolean = js.native
  def getTheme(): typedocLib.distLibOutputThemeMod.Theme = js.native
  def removeAllDirectories(): scala.Unit = js.native
  def removeDirectory(name: java.lang.String): scala.Unit = js.native
}

