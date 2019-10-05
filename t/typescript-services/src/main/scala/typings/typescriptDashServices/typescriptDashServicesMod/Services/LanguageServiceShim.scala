package typings.typescriptDashServices.typescriptDashServicesMod.Services

import typings.typescriptDashServices.TypeScript.Services.ILanguageService
import typings.typescriptDashServices.TypeScript.Services.ILanguageServiceShimHost
import typings.typescriptDashServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends typings.typescriptDashServices.TypeScript.Services.LanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
}

/* static members */
@JSImport("typescript-services", "Services.LanguageServiceShim")
@js.native
object LanguageServiceShim extends js.Object {
  /* private */ def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
  /* private */ def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
}

