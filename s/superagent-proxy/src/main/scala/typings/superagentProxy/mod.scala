package typings.superagentProxy

import typings.superagent.mod.SuperAgentStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(s: SuperAgentStatic): Unit = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("superagent-proxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object superagentAugmentingMod {
    
    trait Request extends StObject {
      
      def proxy(url: String): this.type
    }
    object Request {
      
      inline def apply(proxy: String => Request): Request = {
        val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setProxy(value: String => Request): Self = StObject.set(x, "proxy", js.Any.fromFunction1(value))
      }
    }
  }
}
