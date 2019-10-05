package typings.synaptic.synapticMod.Layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait connectionType extends js.Object

/**
  * Types of connections.
  */
@JSImport("synaptic", "Layer.connectionType")
@js.native
object connectionType extends js.Object {
  /**
    * It connects every neuron from layer A, to every neuron in layer B.
    */
  @js.native
  sealed trait ALL_TO_ALL extends connectionType
  
  /**
    * Useful only in self-connections. It connects every neuron from a layer to all the other neurons in that same layer, except with itself. If this connectionType is used in a connection between different layers, it produces the same result as ALL_TO_ALL.
    */
  @js.native
  sealed trait ALL_TO_ELSE extends connectionType
  
  /**
    * It connects each neuron from layer A, to one neuron in layer B. Both layers must be the same size in order to work.
    */
  @js.native
  sealed trait ONE_TO_ONE extends connectionType
  
  /* 0 */ val ALL_TO_ALL: typings.synaptic.synapticMod.Layer.connectionType.ALL_TO_ALL with Double = js.native
  /* 2 */ val ALL_TO_ELSE: typings.synaptic.synapticMod.Layer.connectionType.ALL_TO_ELSE with Double = js.native
  /* 1 */ val ONE_TO_ONE: typings.synaptic.synapticMod.Layer.connectionType.ONE_TO_ONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectionType with Double] = js.native
}

