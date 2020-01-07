package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueSet", JSImport.Namespace)
@js.native
object baseContainerUniqueSetMod extends js.Object {
  @js.native
  abstract class UniqueSet[Key, Source /* <: UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetIterator<Key, true, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetReverseIterator<Key, true, Source, IteratorT, ReverseT> */ js.Any */] () extends SetContainer[Key, `true`, Source, IteratorT, ReverseT] {
    /**
      * @hidden
      */
    var _Extract_by_iterator: js.Any = js.native
    /**
      * @hidden
      */
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
  
}

