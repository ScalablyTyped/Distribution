package typings.turistFetch

import typings.turistFetch.typesMod.AgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agentWrapperMod {
  
  @JSImport("@turist/fetch/dist/agent-wrapper", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Agent {
    def this(agentOpts: AgentOptions) = this()
    
    /* CompleteClass */
    override def getAgent(url: String): typings.node.httpMod.Agent = js.native
    
    /* CompleteClass */
    var `private`: js.Any = js.native
  }
  
  trait Agent extends StObject {
    
    def getAgent(url: String): typings.node.httpMod.Agent
    
    var `private`: js.Any
  }
  object Agent {
    
    @scala.inline
    def apply(getAgent: String => typings.node.httpMod.Agent, `private`: js.Any): Agent = {
      val __obj = js.Dynamic.literal(getAgent = js.Any.fromFunction1(getAgent))
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    @scala.inline
    implicit class AgentMutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAgent(value: String => typings.node.httpMod.Agent): Self = StObject.set(x, "getAgent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrivate(value: js.Any): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    }
  }
}
