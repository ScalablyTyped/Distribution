package typings.synaptic.synapticMod

import org.scalablytyped.runtime.Instantiable0
import typings.synaptic.synapticMod.LayerNs.LayerConnection
import typings.synaptic.synapticMod.LayerNs.connectionType
import typings.synaptic.synapticMod.LayerNs.gateType
import typings.synaptic.synapticMod.NeuronNs.SquashingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Layer")
@js.native
object LayerNs extends js.Object {
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  @js.native
  class LayerConnection () extends js.Object {
    var ID: Double = js.native
    var connections: js.Any = js.native
    var from: js.Any = js.native
    var gatedfrom: js.Any = js.native
    var list: js.Any = js.native
    var selfconnection: js.Any = js.native
    var size: js.Any = js.native
    var to: js.Any = js.native
    var `type`: js.Any = js.native
  }
  
  trait Options extends js.Object {
    var bias: js.UndefOr[Double] = js.undefined
    var label: js.UndefOr[js.Any] = js.undefined
    var squash: js.UndefOr[SquashingFunction] = js.undefined
  }
  
  @js.native
  class connection () extends LayerConnection
  
  @js.native
  sealed trait connectionType extends js.Object
  
  @js.native
  sealed trait gateType extends js.Object
  
  /* static members */
  @js.native
  object LayerConnection extends js.Object {
    def uid(): Double = js.native
  }
  
  @js.native
  object connection extends Instantiable0[LayerConnection] {
    def uid(): Double = js.native
  }
  
  /**
    * Types of connections.
    */
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
    
    /* 0 */ val ALL_TO_ALL: typings.synaptic.synapticMod.LayerNs.connectionType.ALL_TO_ALL with Double = js.native
    /* 2 */ val ALL_TO_ELSE: typings.synaptic.synapticMod.LayerNs.connectionType.ALL_TO_ELSE with Double = js.native
    /* 1 */ val ONE_TO_ONE: typings.synaptic.synapticMod.LayerNs.connectionType.ONE_TO_ONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[connectionType with Double] = js.native
  }
  
  /**
    * Types of gates.
    */
  @js.native
  object gateType extends js.Object {
    /**
      * If layer C is gating connections between layer A and B, all the neurons from C gate all the input connections to B.
      */
    @js.native
    sealed trait INPUT extends gateType
    
    /**
      * If layer C is gating connections between layer A and B, each neuron from C gates one connection from A to B. This is useful for gating self-connected layers. To use this kind of gateType, A, B and C must be the same size.
      */
    @js.native
    sealed trait ONE_TO_ONE extends gateType
    
    /**
      * If layer C is gating connections between layer A and B, all the neurons from C gate all the output connections from A.
      */
    @js.native
    sealed trait OUTPUT extends gateType
    
    /* 0 */ val INPUT: typings.synaptic.synapticMod.LayerNs.gateType.INPUT with Double = js.native
    /* 2 */ val ONE_TO_ONE: typings.synaptic.synapticMod.LayerNs.gateType.ONE_TO_ONE with Double = js.native
    /* 1 */ val OUTPUT: typings.synaptic.synapticMod.LayerNs.gateType.OUTPUT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[gateType with Double] = js.native
  }
  
}

