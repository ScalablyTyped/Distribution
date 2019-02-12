package typings
package tstlLib.baseContainerUnderscoreITreeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_ITreeContainer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _Construct[Key, T /* <: Elem */, SourceT /* <: tstlLib.baseContainerUnderscoreITreeContainerMod._ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
    source: SourceT,
    Source: tstlLib.baseContainerUnderscoreITreeContainerMod._Factory[SourceT, js.Array[_]],
    treeFactory: js.Function1[/* comp */ js.Function2[/* x */ Key, /* y */ Key, scala.Boolean], scala.Unit],
    args: js.Any*
  ): scala.Unit = js.native
  def _Emplace_hint[Key, T /* <: Elem */, SourceT /* <: tstlLib.baseContainerUnderscoreITreeContainerMod._ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
    source: SourceT,
    hint: IteratorT,
    elem: T,
    data: tstlLib.baseContainerUnderscoreITreeContainerMod.IData[T, IteratorT],
    handleInsert: js.Function2[/* first */ IteratorT, /* last */ IteratorT, scala.Unit],
    breaker: js.Function0[IteratorT]
  ): IteratorT = js.native
}

