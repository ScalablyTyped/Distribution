package typings.synaptic.mod

import typings.synaptic.mod.Layer.LayerConnection
import typings.synaptic.mod.Layer.Options
import typings.synaptic.mod.Layer.connectionType
import typings.synaptic.mod.Layer.gateType
import typings.synaptic.mod.Neuron.SquashingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("synaptic", "Layer")
@js.native
class Layer protected () extends StObject {
  /**
    * Normally you won't work with single neurons, but use Layers instead. A layer is basically an array of neurons, they can do pretty much the same things as neurons do, but it makes the programming process faster.
    * @param numberOfNeurons the number of neurons in that layer
    */
  def this(numberOfNeurons: Double) = this()
  
  /**
    * When a layer activates, it just activates all the neurons in that layer in order, and returns an array with the outputs.
    * @param activation It accepts an array of activations as parameter (for input layers).
    */
  def activate(): js.Array[Double] = js.native
  def activate(activation: js.Array[Double]): js.Array[Double] = js.native
  
  /**
    * Adds a neuron to the layer.
    * @param neuron
    */
  def add(neuron: js.Any): Unit = js.native
  
  /**
    * Clears all the neurons in the layer.
    */
  def clear(): Unit = js.native
  
  /**
    * True of false whether the layer is connected to another layer (parameter) or not.
    * @param layer
    */
  def connected(layer: js.Any): js.Any = js.native
  
  var connectedTo: js.Any = js.native
  
  /**
    * A layer can gate a connection between two other layers, or a layers's self-connection.
    */
  def gate(connection: LayerConnection, gateType: gateType): Unit = js.native
  
  var label: js.Any = js.native
  
  var list: js.Array[Neuron] = js.native
  
  /**
    * Returns an array with all the neurons in the layer, in activation order.
    */
  def neurons(): js.Array[Neuron] = js.native
  
  /**
    * A layer can project a connection to another layer. Layers can also self-connect.
    * @param connectionType If not specified, the connection type is always Layer.connectionType.ALL_TO_ALL when connecting two different layers, and is Layer.connectionType.ONE_TO_ONE when connecting a layer to itself (ie myLayer.project(myLayer)).
    */
  def project(layer: Layer): LayerConnection = js.native
  def project(layer: Layer, connectionType: Unit, weights: js.Any): LayerConnection = js.native
  def project(layer: Layer, connectionType: connectionType): LayerConnection = js.native
  def project(layer: Layer, connectionType: connectionType, weights: js.Any): LayerConnection = js.native
  def project(layer: Network): LayerConnection = js.native
  def project(layer: Network, connectionType: Unit, weights: js.Any): LayerConnection = js.native
  def project(layer: Network, connectionType: connectionType): LayerConnection = js.native
  def project(layer: Network, connectionType: connectionType, weights: js.Any): LayerConnection = js.native
  
  /**
    * After an activation, you can teach the layer what should have been the correct output (a.k.a. train). This is done by backpropagating the error.
    * @param learningRate A learning rate.
    * @param targetValue A target value (array of floats between 0 and 1).
    */
  def propagate(learningRate: Double, targetValue: js.Array[Double]): Unit = js.native
  
  /**
    * Resets all the neurons in the layer.
    */
  def reset(): Unit = js.native
  
  /**
    * True or false whether the whole layer is self-connected or not.
    */
  def selfconnected(): Boolean = js.native
  
  /**
    * Set the squashing function and bias of all the neurons in a layer.
    * @param options
    */
  def set(options: Options): this.type = js.native
  
  var size: Double = js.native
}
object Layer {
  
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  @JSImport("synaptic", "Layer.LayerConnection")
  @js.native
  class LayerConnection () extends StObject {
    
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
  object LayerConnection {
    
    @JSImport("synaptic", "Layer.LayerConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  /* was `typeof LayerConnection` */
  @JSImport("synaptic", "Layer.connection")
  @js.native
  class connection () extends LayerConnection
  /* was `typeof LayerConnection` */
  object connection {
    
    @JSImport("synaptic", "Layer.connection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  @js.native
  sealed trait connectionType extends StObject
  /**
    * Types of connections.
    */
  @JSImport("synaptic", "Layer.connectionType")
  @js.native
  object connectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[connectionType & Double] = js.native
    
    /**
      * It connects every neuron from layer A, to every neuron in layer B.
      */
    @js.native
    sealed trait ALL_TO_ALL
      extends StObject
         with connectionType
    /* 0 */ val ALL_TO_ALL: typings.synaptic.mod.Layer.connectionType.ALL_TO_ALL & Double = js.native
    
    /**
      * Useful only in self-connections. It connects every neuron from a layer to all the other neurons in that same layer, except with itself. If this connectionType is used in a connection between different layers, it produces the same result as ALL_TO_ALL.
      */
    @js.native
    sealed trait ALL_TO_ELSE
      extends StObject
         with connectionType
    /* 2 */ val ALL_TO_ELSE: typings.synaptic.mod.Layer.connectionType.ALL_TO_ELSE & Double = js.native
    
    /**
      * It connects each neuron from layer A, to one neuron in layer B. Both layers must be the same size in order to work.
      */
    @js.native
    sealed trait ONE_TO_ONE
      extends StObject
         with connectionType
    /* 1 */ val ONE_TO_ONE: typings.synaptic.mod.Layer.connectionType.ONE_TO_ONE & Double = js.native
  }
  
  @js.native
  sealed trait gateType extends StObject
  /**
    * Types of gates.
    */
  @JSImport("synaptic", "Layer.gateType")
  @js.native
  object gateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[gateType & Double] = js.native
    
    /**
      * If layer C is gating connections between layer A and B, all the neurons from C gate all the input connections to B.
      */
    @js.native
    sealed trait INPUT
      extends StObject
         with gateType
    /* 0 */ val INPUT: typings.synaptic.mod.Layer.gateType.INPUT & Double = js.native
    
    /**
      * If layer C is gating connections between layer A and B, each neuron from C gates one connection from A to B. This is useful for gating self-connected layers. To use this kind of gateType, A, B and C must be the same size.
      */
    @js.native
    sealed trait ONE_TO_ONE
      extends StObject
         with gateType
    /* 2 */ val ONE_TO_ONE: typings.synaptic.mod.Layer.gateType.ONE_TO_ONE & Double = js.native
    
    /**
      * If layer C is gating connections between layer A and B, all the neurons from C gate all the output connections from A.
      */
    @js.native
    sealed trait OUTPUT
      extends StObject
         with gateType
    /* 1 */ val OUTPUT: typings.synaptic.mod.Layer.gateType.OUTPUT & Double = js.native
  }
  
  trait Options extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[js.Any] = js.undefined
    
    var squash: js.UndefOr[SquashingFunction] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSquash(value: (/* x */ Double, /* derivate */ Boolean) => Double): Self = StObject.set(x, "squash", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
    }
  }
}
