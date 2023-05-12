package typings.undici

import typings.undici.typesMockInterceptorMod.Interceptable
import typings.undici.typesMockPoolMod.MockPool.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMockPoolMod {
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  @JSImport("undici/types/mock-pool", JSImport.Default)
  @js.native
  open class default protected () extends MockPool {
    def this(origin: String, options: Options) = this()
  }
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  @js.native
  trait MockPool
    extends typings.undici.typesPoolMod.default
       with Interceptable
  object MockPool {
    
    trait Options
      extends StObject
         with typings.undici.typesPoolMod.Pool.Options {
      
      /** The agent to associate this MockPool with. */
      var agent: typings.undici.typesMockAgentMod.default[typings.undici.typesMockAgentMod.MockAgent.Options]
    }
    object Options {
      
      inline def apply(
        agent: typings.undici.typesMockAgentMod.default[typings.undici.typesMockAgentMod.MockAgent.Options]
      ): Options = {
        val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAgent(
          value: typings.undici.typesMockAgentMod.default[typings.undici.typesMockAgentMod.MockAgent.Options]
        ): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      }
    }
  }
}
