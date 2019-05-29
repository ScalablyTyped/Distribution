package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeMod {
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type Declaration = Location | (js.Array[Location | LocationLink])
  type Definition = Location | js.Array[Location]
  type DefinitionLink = LocationLink
  type DocumentSelector = DocumentFilter | java.lang.String | (js.Array[DocumentFilter | java.lang.String])
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
  type GlobPattern = java.lang.String | RelativePattern
  /* Rewritten from type alias, can be one of: 
    - MarkdownString
    - java.lang.String
    - vscodeLib.Anon_Language
  */
  type MarkedString = _MarkedString | java.lang.String
  type ProviderResult[T] = js.UndefOr[T | scala.Null | (vscodeLib.Thenable[js.UndefOr[T | scala.Null]])]
}
