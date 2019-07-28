package typings.tstl.baseContainerUnderscoreITreeContainerMod

import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_ITreeContainer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _Construct[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
    source: SourceT,
    Source: _Factory[SourceT, js.Array[_]],
    treeFactory: js.Function1[/* comp */ js.Function2[/* x */ Key, /* y */ Key, Boolean], Unit],
    args: js.Any*
  ): Unit = js.native
  def _Emplacable[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](source: SourceT, hint: IteratorT, elem: T): Boolean = js.native
}

