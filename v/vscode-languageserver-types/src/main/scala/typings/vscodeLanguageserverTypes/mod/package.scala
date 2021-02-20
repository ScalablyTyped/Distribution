package typings.vscodeLanguageserverTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CodeActionKind = java.lang.String
  
  type CompletionItemTag = typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
  
  type MarkedString = java.lang.String | typings.vscodeLanguageserverTypes.anon.Language
  
  type SymbolTag = typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
  
  type Declaration = typings.vscodeLanguageserverTypes.mod.Location | js.Array[typings.vscodeLanguageserverTypes.mod.Location]
  
  type DeclarationLink = typings.vscodeLanguageserverTypes.mod.LocationLink
  
  type Definition = typings.vscodeLanguageserverTypes.mod.Location | js.Array[typings.vscodeLanguageserverTypes.mod.Location]
  
  type DefinitionLink = typings.vscodeLanguageserverTypes.mod.LocationLink
  
  type DocumentUri = java.lang.String
  
  @scala.inline
  def EOL: js.Array[java.lang.String] = typings.vscodeLanguageserverTypes.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[java.lang.String]]
}
