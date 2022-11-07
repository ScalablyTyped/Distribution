package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersBoxHelperMod {
  
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
    
    def dispose(): Unit = js.native
    
    def setFromObject(`object`: Object3D[Event]): this.type = js.native
    
    def update(): Unit = js.native
    def update(`object`: Object3D[Event]): Unit = js.native
  }
}
