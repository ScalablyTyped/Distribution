package typings.tstl

import typings.tstl.multiSetMod.MultiSet.Iterator
import typings.tstl.multiSetMod.MultiSet.ReverseIterator
import typings.tstl.setContainerMod.SetContainer
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiSet", JSImport.Namespace)
@js.native
object multiSetMod extends js.Object {
  @js.native
  abstract class MultiSet[Key, Source /* <: MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Source, IteratorT, ReverseT] */] () extends SetContainer[Key, `false`, Source, IteratorT, ReverseT] {
    /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
  }
  
  @js.native
  object MultiSet extends js.Object {
    /**
      * Iterator of {@link MultiSet}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[Key, SourceT /* <: MultiSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/MultiSet.MultiSet.Iterator<Key, SourceT, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: ReverseIterator[Key, SourceT, IteratorT, ReverseT] */] = typings.tstl.setContainerMod.SetContainer.Iterator[Key, `false`, SourceT, IteratorT, ReverseT]
    /**
      * Reverse iterator of {@link MultiSet}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type ReverseIterator[Key, SourceT /* <: MultiSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, SourceT, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/MultiSet.MultiSet.ReverseIterator<Key, SourceT, IteratorT, ReverseT> */ js.Object */] = typings.tstl.setContainerMod.SetContainer.ReverseIterator[Key, `false`, SourceT, IteratorT, ReverseT]
  }
  
}

