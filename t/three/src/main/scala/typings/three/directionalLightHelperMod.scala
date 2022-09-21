package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.directionalLightMod.DirectionalLight
import typings.three.eventDispatcherMod.Event
import typings.three.lineMod.Line
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionalLightHelperMod {
  
  @JSImport("three/src/helpers/DirectionalLightHelper", "DirectionalLightHelper")
  @js.native
  open class DirectionalLightHelper protected () extends Object3D[Event] {
    /**
      * @param light
      * @param [size=1]
      * @param color
      */
    def this(light: DirectionalLight) = this()
    def this(light: DirectionalLight, size: Double) = this()
    def this(light: DirectionalLight, size: Double, color: ColorRepresentation) = this()
    def this(light: DirectionalLight, size: Unit, color: ColorRepresentation) = this()
    
    /**
      * @default undefined
      */
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    def dispose(): Unit = js.native
    
    var light: DirectionalLight = js.native
    
    var lightPlane: Line[BufferGeometry, Material | js.Array[Material]] = js.native
    
    var targetLine: Line[BufferGeometry, Material | js.Array[Material]] = js.native
    
    def update(): Unit = js.native
  }
}
