package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.lightMod.Light
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotLightHelperMod {
  
  @JSImport("three/src/helpers/SpotLightHelper", "SpotLightHelper")
  @js.native
  open class SpotLightHelper protected () extends Object3D[Event] {
    def this(light: Light) = this()
    def this(light: Light, color: ColorRepresentation) = this()
    
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    var cone: LineSegments[BufferGeometry, Material | js.Array[Material]] = js.native
    
    def dispose(): Unit = js.native
    
    var light: Light = js.native
    
    def update(): Unit = js.native
  }
}
