package typings.synaptic.mod.Layer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait gateType extends js.Object
/**
  * Types of gates.
  */
@JSImport("synaptic", "Layer.gateType")
@js.native
object gateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[gateType with Double] = js.native
  
  /**
    * If layer C is gating connections between layer A and B, all the neurons from C gate all the input connections to B.
    */
  @js.native
  sealed trait INPUT extends gateType
  /* 0 */ @js.native
  object INPUT extends TopLevel[INPUT with Double]
  
  /**
    * If layer C is gating connections between layer A and B, each neuron from C gates one connection from A to B. This is useful for gating self-connected layers. To use this kind of gateType, A, B and C must be the same size.
    */
  @js.native
  sealed trait ONE_TO_ONE extends gateType
  /* 2 */ @js.native
  object ONE_TO_ONE extends TopLevel[ONE_TO_ONE with Double]
  
  /**
    * If layer C is gating connections between layer A and B, all the neurons from C gate all the output connections from A.
    */
  @js.native
  sealed trait OUTPUT extends gateType
  /* 1 */ @js.native
  object OUTPUT extends TopLevel[OUTPUT with Double]
}
