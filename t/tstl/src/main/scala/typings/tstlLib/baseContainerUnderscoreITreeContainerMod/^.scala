package typings
package tstlLib.baseContainerUnderscoreITreeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_ITreeContainer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _Construct[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
    source: SourceT,
    Source: _Factory[SourceT, js.Array[_]],
    treeFactory: js.Function1[/* comp */ js.Function2[/* x */ Key, /* y */ Key, scala.Boolean], scala.Unit],
    args: js.Any*
  ): scala.Unit = js.native
  def _Emplacable[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](source: SourceT, hint: IteratorT, elem: T): scala.Boolean = js.native
}

