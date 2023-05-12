package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreLayersMod {
  
  @JSImport("three/src/core/Layers", "Layers")
  @js.native
  /**
    * Create a new Layers object, with membership initially set to layer 0.
    */
  open class Layers () extends StObject {
    
    /**
      * Remove membership of this `layer`.
      * @param layer An integer from 0 to 31.
      */
    def disable(layer: Double): Unit = js.native
    
    /**
      * Remove membership from all layers.
      */
    def disableAll(): Unit = js.native
    
    /**
      * Add membership of this `layer`.
      * @param layer An integer from 0 to 31.
      */
    def enable(layer: Double): Unit = js.native
    
    /**
      * Add membership to all layers.
      */
    def enableAll(): Unit = js.native
    
    /**
      * Returns true if the given layer is enabled.
      * @param layer An integer from 0 to 31.
      */
    def isEnabled(layer: Double): Boolean = js.native
    
    /**
      * A bit mask storing which of the 32 layers this layers object is currently a member of.
      * @defaultValue `1 | 0`
      * @remarks Expects a `Integer`
      */
    var mask: Double = js.native
    
    /**
      * Set membership to `layer`, and remove membership all other layers.
      * @param layer An integer from 0 to 31.
      */
    def set(layer: Double): Unit = js.native
    
    /**
      * Returns true if this and the passed `layers` object have at least one layer in common.
      * @param layers A Layers object
      */
    def test(layers: Layers): Boolean = js.native
    
    /**
      * Toggle membership of `layer`.
      * @param layer An integer from 0 to 31.
      */
    def toggle(layer: Double): Unit = js.native
  }
}
