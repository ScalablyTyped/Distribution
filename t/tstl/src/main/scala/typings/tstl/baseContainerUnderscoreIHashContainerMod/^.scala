package typings.tstl.baseContainerUnderscoreIHashContainerMod

import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_IHashContainer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _Construct[Key, T /* <: Elem */, SourceT /* <: _IHashContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
    source: SourceT,
    Source: _Factory[SourceT, js.Array[_]],
    bucketFactory: js.Function2[
      /* hashFunction */ js.Function1[/* key */ Key, Double], 
      /* predicator */ js.Function2[/* x */ Key, /* y */ Key, Boolean], 
      Unit
    ],
    args: js.Any*
  ): Unit = js.native
}

