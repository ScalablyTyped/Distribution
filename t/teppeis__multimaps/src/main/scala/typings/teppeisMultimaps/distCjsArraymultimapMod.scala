package typings.teppeisMultimaps

import typings.teppeisMultimaps.distCjsMultimapMod.Multimap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsArraymultimapMod {
  
  @JSImport("@teppeis/multimaps/dist/cjs/arraymultimap", "ArrayMultimap")
  @js.native
  open class ArrayMultimap[K, V] ()
    extends Multimap[K, V, js.Array[V]] {
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
}
