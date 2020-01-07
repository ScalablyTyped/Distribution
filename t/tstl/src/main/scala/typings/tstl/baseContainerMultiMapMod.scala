package typings.tstl

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiMap", JSImport.Namespace)
@js.native
object baseContainerMultiMapMod extends js.Object {
  @js.native
  abstract class MultiMap[Key, T, Source /* <: MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapIterator<Key, T, false, Source, Iterator, Reverse> */ js.Any */, Reverse /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapReverseIterator<Key, T, false, Source, Iterator, Reverse> */ js.Any */] () extends MapContainer[Key, T, `false`, Source, Iterator, Reverse] {
    /**
      * @hidden
      */
    /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
  }
  
}

