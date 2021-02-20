package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.OutliningElementsCollector")
@js.native
class OutliningElementsCollector ()
  extends typings.typescriptServices.TypeScript.Services.OutliningElementsCollector
object OutliningElementsCollector {
  
  @JSImport("typescript-services", "Services.OutliningElementsCollector")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.OutliningElementsCollector.MaximumDepth")
  @js.native
  def MaximumDepth: js.Any = js.native
  @scala.inline
  def MaximumDepth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaximumDepth")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Services.OutliningElementsCollector.collectElements")
  @js.native
  def collectElements(node: SourceUnitSyntax): js.Array[TextSpan] = js.native
}
