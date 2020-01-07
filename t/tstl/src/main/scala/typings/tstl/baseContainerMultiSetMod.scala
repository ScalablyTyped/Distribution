package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiSet", JSImport.Namespace)
@js.native
object baseContainerMultiSetMod extends js.Object {
  @js.native
  abstract class MultiSet[Key, Source /* <: MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetIterator<Key, false, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetReverseIterator<Key, false, Source, IteratorT, ReverseT> */ js.Any */] () extends SetContainer[Key, `false`, Source, IteratorT, ReverseT] {
    /**
      * @hidden
      */
    /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
  }
  
}

