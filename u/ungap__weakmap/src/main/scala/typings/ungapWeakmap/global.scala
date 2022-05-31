package typings.ungapWeakmap

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WeakMap {
    
    @JSGlobal("WeakMap")
    @js.native
    class ^[K /* <: js.Object */, V] ()
      extends typings.ungapWeakmap.mod.^[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
      def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
    }
  }
}
