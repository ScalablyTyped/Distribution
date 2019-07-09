package typings
package tstlLib.baseContainerUnderscoreIHashContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_IHashContainer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _Construct[Key, T /* <: Elem */, SourceT /* <: _IHashContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
    source: SourceT,
    Source: _Factory[SourceT, js.Array[_]],
    bucketFactory: js.Function2[
      /* hashFunction */ js.Function1[/* key */ Key, scala.Double], 
      /* predicator */ js.Function2[/* x */ Key, /* y */ Key, scala.Boolean], 
      scala.Unit
    ],
    args: js.Any*
  ): scala.Unit = js.native
}

