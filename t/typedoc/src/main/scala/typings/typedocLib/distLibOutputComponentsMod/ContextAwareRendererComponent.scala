package typings
package typedocLib.distLibOutputComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/components", "ContextAwareRendererComponent")
@js.native
abstract class ContextAwareRendererComponent () extends RendererComponent {
  var location: js.Any = js.native
  var project: js.UndefOr[typedocLib.distLibModelsReflectionsMod.ProjectReflection] = js.native
  var reflection: js.UndefOr[typedocLib.distLibModelsReflectionsMod.DeclarationReflection] = js.native
  var urlPrefix: stdLib.RegExp = js.native
  def getRelativeUrl(absolute: java.lang.String): java.lang.String = js.native
  /* protected */ def onBeginPage(page: typedocLib.distLibOutputEventsMod.PageEvent): scala.Unit = js.native
  /* protected */ def onBeginRenderer(event: typedocLib.distLibOutputEventsMod.RendererEvent): scala.Unit = js.native
}

