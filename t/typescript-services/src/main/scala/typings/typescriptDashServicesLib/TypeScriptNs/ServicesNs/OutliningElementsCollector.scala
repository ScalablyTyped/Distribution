package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.OutliningElementsCollector")
@js.native
class OutliningElementsCollector ()
  extends typescriptDashServicesLib.TypeScriptNs.DepthLimitedWalker {
  var elements: js.Any = js.native
  var inObjectLiteralExpression: js.Any = js.native
  /* private */ def addOutlineRange(node: js.Any, startElement: js.Any, endElement: js.Any): js.Any = js.native
}

@JSGlobal("TypeScript.Services.OutliningElementsCollector")
@js.native
object OutliningElementsCollector extends js.Object {
  var MaximumDepth: js.Any = js.native
  def collectElements(node: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax): js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan] = js.native
}

