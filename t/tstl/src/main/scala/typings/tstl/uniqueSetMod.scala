package typings.tstl

import typings.tstl.setContainerMod.SetContainer
import typings.tstl.tstlBooleans.`true`
import typings.tstl.uniqueSetMod.UniqueSet.Iterator
import typings.tstl.uniqueSetMod.UniqueSet.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueSet", JSImport.Namespace)
@js.native
object uniqueSetMod extends js.Object {
  @js.native
  abstract class UniqueSet[Key, Source /* <: UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Source, IteratorT, ReverseT] */] () extends SetContainer[Key, `true`, Source, IteratorT, ReverseT] {
    var _Extract_by_iterator: js.Any = js.native
    var _Extract_by_val: js.Any = js.native
    /**
      * Extract an element by key.
      *
      * @param key Key to search for.
      * @return The extracted element.
      */
    def extract(key: Key): Key = js.native
    /**
      * Extract an element by iterator.
      *
      * @param pos The iterator to the element for extraction.
      * @return Iterator following the *pos*, strained by the extraction.
      */
    @JSName("extract")
    def extract_IteratorT(it: IteratorT): IteratorT = js.native
  }
  
  @js.native
  object UniqueSet extends js.Object {
    /**
      * Iterator of {@link UniqueSet}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[Key, SourceT /* <: UniqueSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/UniqueSet.UniqueSet.Iterator<Key, SourceT, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: ReverseIterator[Key, SourceT, IteratorT, ReverseT] */] = typings.tstl.setContainerMod.SetContainer.Iterator[Key, `true`, SourceT, IteratorT, ReverseT]
    /**
      * Reverse iterator of {@link UniqueSet}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type ReverseIterator[Key, SourceT /* <: UniqueSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, SourceT, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/UniqueSet.UniqueSet.ReverseIterator<Key, SourceT, IteratorT, ReverseT> */ js.Object */] = typings.tstl.setContainerMod.SetContainer.ReverseIterator[Key, `true`, SourceT, IteratorT, ReverseT]
  }
  
}

