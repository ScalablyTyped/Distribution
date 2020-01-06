package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/ISetIterator", JSImport.Namespace)
@js.native
object baseIteratorISetIteratorMod extends js.Object {
  type ISetIterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/iterator/ISetIterator.ISetIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] = Iterator[Key, Source, IteratorT, ReverseT, Key]
  type ISetReverseIterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/iterator/ISetIterator.ISetReverseIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Object */] = IReverseIterator[Key, Source, IteratorT, ReverseT, Key]
}

