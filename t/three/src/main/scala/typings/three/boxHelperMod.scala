package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxHelperMod {
  
  @JSImport("three/src/helpers/BoxHelper", "BoxHelper")
  @js.native
  open class BoxHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    /**
      * @param object
      * @param [color=0xffff00]
      */
    def this(`object`: Object3D[Event]) = this()
    def this(`object`: Object3D[Event], color: ColorRepresentation) = this()
    
    def setFromObject(`object`: Object3D[Event]): this.type = js.native
    
    def update(): Unit = js.native
    def update(`object`: Object3D[Event]): Unit = js.native
  }
}
