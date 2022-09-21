package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRangeKind {
  
  /**
    * Folding range for a comment
    */
  @JSImport("vscode-languageclient", "FoldingRangeKind.Comment")
  @js.native
  val Comment: /* "comment" */ String = js.native
  
  /**
    * Folding range for an import or include
    */
  @JSImport("vscode-languageclient", "FoldingRangeKind.Imports")
  @js.native
  val Imports: /* "imports" */ String = js.native
  
  /**
    * Folding range for a region (e.g. `#region`)
    */
  @JSImport("vscode-languageclient", "FoldingRangeKind.Region")
  @js.native
  val Region: /* "region" */ String = js.native
}
