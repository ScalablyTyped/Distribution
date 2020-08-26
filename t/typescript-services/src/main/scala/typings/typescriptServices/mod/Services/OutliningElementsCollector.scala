package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.OutliningElementsCollector")
@js.native
class OutliningElementsCollector ()
  extends typings.typescriptServices.TypeScript.Services.OutliningElementsCollector

/* static members */
@JSImport("typescript-services", "Services.OutliningElementsCollector")
@js.native
object OutliningElementsCollector extends js.Object {
  var MaximumDepth: js.Any = js.native
  def collectElements(node: SourceUnitSyntax): js.Array[TextSpan] = js.native
}

