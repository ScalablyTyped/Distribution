package typings.tstl

import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.multiMapMod.MultiMap.Iterator
import typings.tstl.multiMapMod.MultiMap.ReverseIterator
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiMap", JSImport.Namespace)
@js.native
object multiMapMod extends js.Object {
  @js.native
  abstract class MultiMap[Key, T, Source /* <: MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: Iterator[Key, T, Source, Iterator, Reverse] */, Reverse /* <: ReverseIterator[Key, T, Source, Iterator, Reverse] */] () extends MapContainer[Key, T, `false`, Source, Iterator, Reverse] {
    /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
  }
  
  @js.native
  object MultiMap extends js.Object {
    /**
      * Iterator of {@link MultiMap}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[Key, T, SourceT /* <: MultiMap[Key, T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/MultiMap.MultiMap.Iterator<Key, T, SourceT, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: ReverseIterator[Key, T, SourceT, IteratorT, ReverseT] */] = typings.tstl.mapContainerMod.MapContainer.Iterator[Key, T, `false`, SourceT, IteratorT, ReverseT]
    /**
      * Reverse iterator of {@link MultiMap}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type ReverseIterator[Key, T, SourceT /* <: MultiMap[Key, T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/MultiMap.MultiMap.ReverseIterator<Key, T, SourceT, IteratorT, ReverseT> */ js.Object */] = typings.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, `false`, SourceT, IteratorT, ReverseT]
  }
  
}

