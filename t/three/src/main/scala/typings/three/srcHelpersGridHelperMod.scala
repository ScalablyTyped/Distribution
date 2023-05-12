package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersGridHelperMod {
  
  @JSImport("three/src/helpers/GridHelper", "GridHelper")
  @js.native
  /**
    * Creates a new {@link GridHelper} of size 'size' and divided into 'divisions' segments per side
    * @remarks
    * Colors are optional.
    * @param size The size of the grid. Default `10`
    * @param divisions The number of divisions across the grid. Default `10`
    * @param colorCenterLine The color of the centerline. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x444444`
    * @param colorGrid The color of the lines of the grid. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x888888`
    */
  open class GridHelper ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    def this(size: Double) = this()
    def this(size: Double, divisions: Double) = this()
    def this(size: Unit, divisions: Double) = this()
    def this(size: Double, divisions: Double, color1: ColorRepresentation) = this()
    def this(size: Double, divisions: Unit, color1: ColorRepresentation) = this()
    def this(size: Unit, divisions: Double, color1: ColorRepresentation) = this()
    def this(size: Unit, divisions: Unit, color1: ColorRepresentation) = this()
    def this(size: Double, divisions: Double, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Double, divisions: Double, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    def this(size: Double, divisions: Unit, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Double, divisions: Unit, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Double, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Double, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Unit, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Unit, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `GridHelper`
      */
    @JSName("type")
    val type_GridHelper: String | typings.three.threeStrings.GridHelper = js.native
  }
}
