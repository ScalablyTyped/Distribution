package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.ILanguageService
import typings.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typings.typescriptServices.TypeScript.Services.IShimFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends typings.typescriptServices.TypeScript.Services.LanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
}
object LanguageServiceShim {
  
  /* static member */
  @JSImport("typescript-services", "Services.LanguageServiceShim.realizeDiagnostic")
  @js.native
  def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.LanguageServiceShim.realizeDiagnosticCategory")
  @js.native
  def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
}
