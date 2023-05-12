package typings.undici

import typings.undici.typesMockClientMod.MockClient.Options
import typings.undici.typesMockInterceptorMod.Interceptable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMockClientMod {
  
  /** MockClient extends the Client API and allows one to mock requests. */
  @JSImport("undici/types/mock-client", JSImport.Default)
  @js.native
  open class default protected () extends MockClient {
    def this(origin: String, options: Options) = this()
  }
  
  /** MockClient extends the Client API and allows one to mock requests. */
  @js.native
  trait MockClient
    extends typings.undici.typesClientMod.default
       with Interceptable
  object MockClient {
    
    trait Options
      extends StObject
         with typings.undici.typesClientMod.Client.Options {
      
      /** The agent to associate this MockClient with. */
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
