package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.lineMod.Line
import typings.three.materialMod.Material
import typings.three.meshMod.Mesh
import typings.three.object3DMod.Object3D
import typings.three.utilsMod.ColorRepresentation
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowHelperMod {
  
  @JSImport("three/src/helpers/ArrowHelper", "ArrowHelper")
  @js.native
  open class ArrowHelper protected () extends Object3D[Event] {
    /**
      * @param [dir] Direction from origin. Must be a unit vector.
      * @param [origin] Point at which the arrow starts.
      * @param [length] Length of the arrow.
      * @param [color] Hexadecimal value to define color.
      * @param [headLength] The length of the head of the arrow.
      * @param [headWidth] The width of the head of the arrow.
      */
    def this(
      dir: js.UndefOr[Vector3],
      origin: js.UndefOr[Vector3],
      length: js.UndefOr[Double],
      color: js.UndefOr[ColorRepresentation],
      headLength: js.UndefOr[Double],
      headWidth: js.UndefOr[Double]
    ) = this()
    
    /**
      * Contains the cone part of the arrowHelper.
      */
    var cone: Mesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    /**
      * Contains the line part of the arrowHelper.
      */
    var line: Line[BufferGeometry, Material | js.Array[Material]] = js.native
    
    /**
      * @param color The desired color.
      */
    def setColor(color: ColorRepresentation): Unit = js.native
    
    /**
      * @param dir The desired direction. Must be a unit vector.
      */
    def setDirection(dir: Vector3): Unit = js.native
    
    /**
      * @param length The desired length.
      * @param [headLength] The length of the head of the arrow.
      * @param [headWidth] The width of the head of the arrow.
      */
    def setLength(length: Double): Unit = js.native
    def setLength(length: Double, headLength: Double): Unit = js.native
    def setLength(length: Double, headLength: Double, headWidth: Double): Unit = js.native
    def setLength(length: Double, headLength: Unit, headWidth: Double): Unit = js.native
  }
}
