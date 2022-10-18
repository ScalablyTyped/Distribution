package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsLightMod.Light
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersSpotLightHelperMod {
  
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
