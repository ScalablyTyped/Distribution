package typings.synaptic.synapticMod.Layer

import org.scalablytyped.runtime.TopLevel
import typings.synaptic.synapticMod.Layer.gateType.INPUT
import typings.synaptic.synapticMod.Layer.gateType.ONE_TO_ONE
import typings.synaptic.synapticMod.Layer.gateType.OUTPUT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[gateType with Double] = js.native
  /* 0 */ @js.native
  object INPUT extends TopLevel[INPUT with Double]
  
  /* 2 */ @js.native
  object ONE_TO_ONE extends TopLevel[ONE_TO_ONE with Double]
  
  /* 1 */ @js.native
  object OUTPUT extends TopLevel[OUTPUT with Double]
  
}

