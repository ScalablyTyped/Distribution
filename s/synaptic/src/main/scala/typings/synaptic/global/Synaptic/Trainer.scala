package typings.synaptic.global.Synaptic

import typings.synaptic.mod.Trainer.CostFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Synaptic.Trainer")
@js.native
class Trainer protected ()
  extends typings.synaptic.mod.Trainer {
  /**
    * The Trainer makes it easier to train any set to any network, no matter its architecture. The trainer also contains built-in tasks to test the performance of your network.
    * @param network
    */
  def this(network: typings.synaptic.mod.Network) = this()
}
object Trainer {
  
  object cost {
    
    @JSGlobal("Synaptic.Trainer.cost.BINARY")
    @js.native
    val BINARY: CostFunction = js.native
    
    @JSGlobal("Synaptic.Trainer.cost.CROSS_ENTROPY")
    @js.native
    val CROSS_ENTROPY: CostFunction = js.native
    
    @JSGlobal("Synaptic.Trainer.cost.MSE")
    @js.native
    val MSE: CostFunction = js.native
  }
}
