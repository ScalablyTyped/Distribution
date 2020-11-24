package typings.three

import typings.three.anon.NeedsUpdate
import typings.three.cameraMod.Camera
import typings.three.materialMod.Material
import typings.three.webGLPropertiesMod.WebGLProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLClipping", JSImport.Namespace)
@js.native
object webGLClippingMod extends js.Object {
  
  @js.native
  class WebGLClipping protected () extends js.Object {
    def this(properties: WebGLProperties) = this()
    
    def beginShadows(): Unit = js.native
    
    def endShadows(): Unit = js.native
    
    def init(planes: js.Array[_], enableLocalClipping: Boolean, camera: Camera): Boolean = js.native
    
    /**
    	 * @default 0
    	 */
    var numIntersection: Double = js.native
    
    /**
    	 * @default 0
    	 */
    var numPlanes: Double = js.native
    
    def setState(material: Material, camera: Camera, useCache: Boolean): Unit = js.native
    
    var uniform: NeedsUpdate = js.native
  }
}
