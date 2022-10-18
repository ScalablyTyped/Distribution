package typings.typedoc

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsMapMod {
  
  @JSImport("typedoc/dist/lib/utils/map", "DefaultMap")
  @js.native
  open class DefaultMap[K, V] protected ()
    extends StObject
       with Map[K, V] {
    def this(creator: js.Function0[V]) = this()
    
    /* private */ var creator: Any = js.native
  }
}
