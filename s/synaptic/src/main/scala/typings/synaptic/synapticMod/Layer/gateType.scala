package typings.synaptic.synapticMod.Layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait gateType extends js.Object

/**
  * Types of gates.
  */
@JSImport("synaptic", "Layer.gateType")
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
  
  /* 0 */ val INPUT: typings.synaptic.synapticMod.Layer.gateType.INPUT with Double = js.native
  /* 2 */ val ONE_TO_ONE: typings.synaptic.synapticMod.Layer.gateType.ONE_TO_ONE with Double = js.native
  /* 1 */ val OUTPUT: typings.synaptic.synapticMod.Layer.gateType.OUTPUT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[gateType with Double] = js.native
}

