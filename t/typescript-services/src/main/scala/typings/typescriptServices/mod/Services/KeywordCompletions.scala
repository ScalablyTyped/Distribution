package typings.typescriptServices.mod.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.KeywordCompletions")
@js.native
class KeywordCompletions ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.KeywordCompletions
object KeywordCompletions {
  
  @JSImport("typescript-services", "Services.KeywordCompletions")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getKeywordCompltions(): js.Array[typings.typescriptServices.TypeScript.Services.ResolvedCompletionEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeywordCompltions")().asInstanceOf[js.Array[typings.typescriptServices.TypeScript.Services.ResolvedCompletionEntry]]
  
  /* static member */
  @JSImport("typescript-services", "Services.KeywordCompletions.keywordCompletions")
  @js.native
  def keywordCompletions: js.Any = js.native
  inline def keywordCompletions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keywordCompletions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Services.KeywordCompletions.keywords")
  @js.native
  def keywords: js.Any = js.native
  inline def keywords_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keywords")(x.asInstanceOf[js.Any])
}
