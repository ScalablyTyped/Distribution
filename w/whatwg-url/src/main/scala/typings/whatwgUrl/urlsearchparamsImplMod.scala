package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.whatwgUrl.anon.DoNotStripQMark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlsearchparamsImplMod {
  
  @JSImport("whatwg-url/lib/URLSearchParams-impl", "implementation")
  @js.native
  class implementation protected ()
    extends StObject
       with URLSearchParamsImpl {
    def this(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ) = this()
  }
  
  @js.native
  trait URLSearchParamsImpl extends StObject {
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def getAll(name: String): js.Array[String] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def sort(): Unit = js.native
  }
}
