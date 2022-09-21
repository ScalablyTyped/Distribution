package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.Language
import typings.vscode.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type CharacterPair = js.Tuple2[String, String]

type Declaration = Location | (js.Array[Location | LocationLink])

type Definition = Location | js.Array[Location]

type DefinitionLink = LocationLink

type DocumentSelector = DocumentFilter | String | (js.Array[DocumentFilter | String])

type Event[T] = js.Function3[
/* listener */ js.Function1[/* e */ T, Any], 
/* thisArgs */ js.UndefOr[Any], 
/* disposables */ js.UndefOr[js.Array[Disposable]], 
Disposable]

type GlobPattern = String | RelativePattern

type MarkedString = String | Language

type ProviderResult[T] = js.UndefOr[T | Null | (Thenable[js.UndefOr[T | Null]])]
