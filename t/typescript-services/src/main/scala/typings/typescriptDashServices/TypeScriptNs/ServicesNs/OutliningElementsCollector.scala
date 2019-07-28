package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.DepthLimitedWalker
import typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax
import typings.typescriptDashServices.TypeScriptNs.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.OutliningElementsCollector")
@js.native
class OutliningElementsCollector () extends DepthLimitedWalker {
  var elements: js.Any = js.native
  var inObjectLiteralExpression: js.Any = js.native
  /* private */ def addOutlineRange(node: js.Any, startElement: js.Any, endElement: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.OutliningElementsCollector")
@js.native
object OutliningElementsCollector extends js.Object {
  var MaximumDepth: js.Any = js.native
  def collectElements(node: SourceUnitSyntax): js.Array[TextSpan] = js.native
}

