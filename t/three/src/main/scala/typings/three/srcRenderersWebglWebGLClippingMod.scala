package typings.three

import typings.three.anon.NeedsUpdate
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcRenderersWebglWebGLPropertiesMod.WebGLProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLClippingMod {
  
  @JSImport("three/src/renderers/webgl/WebGLClipping", "WebGLClipping")
  @js.native
  open class WebGLClipping protected () extends StObject {
    def this(properties: WebGLProperties) = this()
    
    def beginShadows(): Unit = js.native
    
    def endShadows(): Unit = js.native
    
    def init(planes: js.Array[Any], enableLocalClipping: Boolean): Boolean = js.native
    
    /**
      * @default 0
      */
    var numIntersection: Double = js.native
    
    /**
      * @default 0
      */
    var numPlanes: Double = js.native
    
    def setGlobalState(planes: js.Array[Plane], camera: Camera): Unit = js.native
    
    def setState(material: Material, camera: Camera, useCache: Boolean): Unit = js.native
    
    var uniform: NeedsUpdate = js.native
  }
}
