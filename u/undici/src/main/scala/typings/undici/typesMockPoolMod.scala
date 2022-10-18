package typings.undici

import typings.undici.typesMockInterceptorMod.Interceptable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMockPoolMod {
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  @JSImport("undici/types/mock-pool", JSImport.Namespace)
  @js.native
  open class ^ protected () extends MockPool {
    def this(origin: String, options: Options) = this()
  }
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  @js.native
  trait MockPool
    extends typings.undici.typesPoolMod.^
       with Interceptable
  
  trait Options
    extends StObject
       with typings.undici.typesPoolMod.Options {
    
    /** The agent to associate this MockPool with. */
    var agent: typings.undici.typesMockAgentMod.^[typings.undici.typesMockAgentMod.Options]
  }
  object Options {
    
    inline def apply(agent: typings.undici.typesMockAgentMod.^[typings.undici.typesMockAgentMod.Options]): Options = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgent(value: typings.undici.typesMockAgentMod.^[typings.undici.typesMockAgentMod.Options]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    }
  }
}
