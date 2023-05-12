package typings.teppeisMultimaps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@teppeis/multimaps", "ArrayMultimap")
  @js.native
  open class ArrayMultimap[K, V] ()
    extends typings.teppeisMultimaps.distCjsArraymultimapMod.ArrayMultimap[K, V] {
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  
  @JSImport("@teppeis/multimaps", "SetMultimap")
  @js.native
  open class SetMultimap[K, V] ()
    extends typings.teppeisMultimaps.distCjsSetmultimapMod.SetMultimap[K, V] {
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
}
