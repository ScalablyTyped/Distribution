package typings.synaptic.mod.Layer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait connectionType extends js.Object
/**
  * Types of connections.
  */
@JSImport("synaptic", "Layer.connectionType")
@js.native
object connectionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectionType with Double] = js.native
  
  /**
    * It connects every neuron from layer A, to every neuron in layer B.
    */
  @js.native
  sealed trait ALL_TO_ALL extends connectionType
  /* 0 */ @js.native
  object ALL_TO_ALL extends TopLevel[ALL_TO_ALL with Double]
  
  /**
    * Useful only in self-connections. It connects every neuron from a layer to all the other neurons in that same layer, except with itself. If this connectionType is used in a connection between different layers, it produces the same result as ALL_TO_ALL.
    */
  @js.native
  sealed trait ALL_TO_ELSE extends connectionType
  /* 2 */ @js.native
  object ALL_TO_ELSE extends TopLevel[ALL_TO_ELSE with Double]
  
  /**
    * It connects each neuron from layer A, to one neuron in layer B. Both layers must be the same size in order to work.
    */
  @js.native
  sealed trait ONE_TO_ONE extends connectionType
  /* 1 */ @js.native
  object ONE_TO_ONE extends TopLevel[ONE_TO_ONE with Double]
}
