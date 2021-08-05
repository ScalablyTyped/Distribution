package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware
import typings.vscodeLanguageclient.declarationMod.DeclarationMiddleware
import typings.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware
import typings.vscodeLanguageclient.implementationMod.ImplementationMiddleware
import typings.vscodeLanguageclient.selectionRangeMod.SelectionRangeProviderMiddleware
import typings.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware
  extends StObject
     with _Middleware
     with TypeDefinitionMiddleware
     with ImplementationMiddleware
     with ColorProviderMiddleware
     with FoldingRangeProviderMiddleware
     with DeclarationMiddleware
     with SelectionRangeProviderMiddleware
object Middleware {
  
  inline def apply(): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Middleware]
  }
}
