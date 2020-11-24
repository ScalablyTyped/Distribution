package typings.tsNode.anon

import typings.typescript.mod.DocumentRegistry
import typings.typescript.mod.LanguageService
import typings.typescript.mod.LanguageServiceHost
import typings.typescript.mod.LanguageServiceMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode extends js.Object {
  
  def apply(host: LanguageServiceHost): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: js.UndefOr[scala.Nothing],
    syntaxOnlyOrLanguageServiceMode: Boolean
  ): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: js.UndefOr[scala.Nothing],
    syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
  ): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry,
    syntaxOnlyOrLanguageServiceMode: Boolean
  ): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry,
    syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
  ): LanguageService = js.native
}
