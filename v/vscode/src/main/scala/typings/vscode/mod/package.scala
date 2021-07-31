package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def version: java.lang.String = typings.vscode.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]

type Declaration = typings.vscode.mod.Location | (js.Array[typings.vscode.mod.Location | typings.vscode.mod.LocationLink])

type Definition = typings.vscode.mod.Location | js.Array[typings.vscode.mod.Location]

type DefinitionLink = typings.vscode.mod.LocationLink

type DocumentSelector = typings.vscode.mod.DocumentFilter | java.lang.String | (js.Array[typings.vscode.mod.DocumentFilter | java.lang.String])

type Event[T] = js.Function3[
/* listener */ js.Function1[/* e */ T, js.Any], 
/* thisArgs */ js.UndefOr[js.Any], 
/* disposables */ js.UndefOr[js.Array[typings.vscode.mod.Disposable]], 
typings.vscode.mod.Disposable]

type GlobPattern = java.lang.String | typings.vscode.mod.RelativePattern

/* Rewritten from type alias, can be one of: 
  - typings.vscode.mod.MarkdownString
  - java.lang.String
  - typings.vscode.anon.Language
*/
type MarkedString = typings.vscode.mod._MarkedString | java.lang.String

type ProviderResult[T] = js.UndefOr[T | scala.Null | (typings.vscode.Thenable[js.UndefOr[T | scala.Null]])]
