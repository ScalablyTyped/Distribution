package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.vscodeLanguageserverTypes.mod.FoldingRangeKind & String] = js.native
  
  /* "comment" */ val Comment: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Comment & String = js.native
  
  /* "imports" */ val Imports: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Imports & String = js.native
  
  /* "region" */ val Region: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Region & String = js.native
}
