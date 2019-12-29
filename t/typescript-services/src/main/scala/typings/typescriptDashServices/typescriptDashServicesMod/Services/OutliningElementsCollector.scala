package typings.typescriptDashServices.typescriptDashServicesMod.Services

import typings.typescriptDashServices.TypeScript.SourceUnitSyntax
import typings.typescriptDashServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.OutliningElementsCollector")
@js.native
class OutliningElementsCollector ()
  extends typings.typescriptDashServices.TypeScript.Services.OutliningElementsCollector

/* static members */
@JSImport("typescript-services", "Services.OutliningElementsCollector")
@js.native
object OutliningElementsCollector extends js.Object {
  var MaximumDepth: js.Any = js.native
  def collectElements(node: SourceUnitSyntax): js.Array[TextSpan] = js.native
}

