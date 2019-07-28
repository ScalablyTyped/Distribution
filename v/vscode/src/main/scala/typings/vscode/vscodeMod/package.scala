package typings.vscode

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeMod {
  type CharacterPair = js.Tuple2[String, String]
  type Declaration = Location | (js.Array[Location | LocationLink])
  type Definition = Location | js.Array[Location]
  type DefinitionLink = LocationLink
  type DocumentSelector = DocumentFilter | String | (js.Array[DocumentFilter | String])
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
  type GlobPattern = String | RelativePattern
  /* Rewritten from type alias, can be one of: 
    - typings.vscode.vscodeMod.MarkdownString
    - java.lang.String
    - typings.vscode.Anon_Language
  */
  type MarkedString = _MarkedString | String
  type ProviderResult[T] = js.UndefOr[T | Null | (Thenable[js.UndefOr[T | Null]])]
}
