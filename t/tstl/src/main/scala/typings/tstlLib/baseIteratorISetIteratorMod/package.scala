package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseIteratorISetIteratorMod {
  type ISetIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias tstl.tstl/base/iterator/ISetIterator.ISetIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] = tstlLib.baseIteratorIteratorMod.Iterator[Key, Source, IteratorT, ReverseT, Key]
  type ISetReverseIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias tstl.tstl/base/iterator/ISetIterator.ISetReverseIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Object */] = tstlLib.baseIteratorReverseIteratorMod.IReverseIterator[Key, Source, IteratorT, ReverseT, Key]
}
