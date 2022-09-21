package typings.unicodeTrie

import typings.node.bufferMod.global.Buffer
import typings.unicodeTrie.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unicode-trie", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with UnicodeTrie {
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: Buffer) = this()
    def this(data: Data) = this()
    
    /* CompleteClass */
    override def get(codePoint: Double): Double = js.native
  }
  
  trait UnicodeTrie extends StObject {
    
    def get(codePoint: Double): Double
  }
  object UnicodeTrie {
    
    inline def apply(get: Double => Double): UnicodeTrie = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[UnicodeTrie]
    }
    
    extension [Self <: UnicodeTrie](x: Self) {
      
      inline def setGet(value: Double => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
}
