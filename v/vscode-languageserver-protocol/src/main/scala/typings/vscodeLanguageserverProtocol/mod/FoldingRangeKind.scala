package typings.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.vscodeLanguageserverTypes.mod.FoldingRangeKind with String] = js.native
  
  /* "comment" */ val Comment: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Comment with String = js.native
  
  /* "imports" */ val Imports: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Imports with String = js.native
  
  /* "region" */ val Region: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Region with String = js.native
}
