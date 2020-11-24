package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/Layers", JSImport.Namespace)
@js.native
object layersMod extends js.Object {
  
  @js.native
  class Layers () extends js.Object {
    
    def disable(channel: Double): Unit = js.native
    
    def disableAll(): Unit = js.native
    
    def enable(channel: Double): Unit = js.native
    
    def enableAll(): Unit = js.native
    
    /**
    	 * @default 1 | 0
    	 */
    var mask: Double = js.native
    
    def set(channel: Double): Unit = js.native
    
    def test(layers: Layers): Boolean = js.native
    
    def toggle(channel: Double): Unit = js.native
  }
}
