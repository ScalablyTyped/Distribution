package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeMod {
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type Definition = Location | js.Array[Location]
  type DocumentSelector = java.lang.String | DocumentFilter | (js.Array[java.lang.String | DocumentFilter])
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
  type MarkedString = _MarkedString | java.lang.String
  type ProviderResult[T] = js.UndefOr[T | scala.Null | (vscodeLib.Thenable[js.UndefOr[T | scala.Null]])]
}
