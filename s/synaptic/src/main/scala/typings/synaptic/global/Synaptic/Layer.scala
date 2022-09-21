package typings.synaptic.global.Synaptic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Synaptic.Layer")
@js.native
open class Layer protected ()
  extends typings.synaptic.mod.Layer {
  /**
    * Normally you won't work with single neurons, but use Layers instead. A layer is basically an array of neurons, they can do pretty much the same things as neurons do, but it makes the programming process faster.
    * @param numberOfNeurons the number of neurons in that layer
    */
  def this(numberOfNeurons: Double) = this()
}
object Layer {
  
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  @JSGlobal("Synaptic.Layer.LayerConnection")
  @js.native
  open class LayerConnection ()
    extends typings.synaptic.mod.Layer.LayerConnection
  object LayerConnection {
    
    @JSGlobal("Synaptic.Layer.LayerConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  /* was `typeof LayerConnection` */
  @JSGlobal("Synaptic.Layer.connection")
  @js.native
  open class connection ()
    extends typings.synaptic.mod.Layer.connection
  /* was `typeof LayerConnection` */
  object connection {
    
    @JSGlobal("Synaptic.Layer.connection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  /**
    * Types of connections.
    */
  @JSGlobal("Synaptic.Layer.connectionType")
  @js.native
  object connectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.synaptic.mod.Layer.connectionType & Double] = js.native
    
    /* 0 */ val ALL_TO_ALL: typings.synaptic.mod.Layer.connectionType.ALL_TO_ALL & Double = js.native
    
    /* 2 */ val ALL_TO_ELSE: typings.synaptic.mod.Layer.connectionType.ALL_TO_ELSE & Double = js.native
    
    /* 1 */ val ONE_TO_ONE: typings.synaptic.mod.Layer.connectionType.ONE_TO_ONE & Double = js.native
  }
  
  /**
    * Types of gates.
    */
  @JSGlobal("Synaptic.Layer.gateType")
  @js.native
  object gateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.synaptic.mod.Layer.gateType & Double] = js.native
    
    /* 0 */ val INPUT: typings.synaptic.mod.Layer.gateType.INPUT & Double = js.native
    
    /* 2 */ val ONE_TO_ONE: typings.synaptic.mod.Layer.gateType.ONE_TO_ONE & Double = js.native
    
    /* 1 */ val OUTPUT: typings.synaptic.mod.Layer.gateType.OUTPUT & Double = js.native
  }
}
