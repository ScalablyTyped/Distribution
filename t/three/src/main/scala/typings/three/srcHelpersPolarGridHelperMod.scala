package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersPolarGridHelperMod {
  
  @JSImport("three/src/helpers/PolarGridHelper", "PolarGridHelper")
  @js.native
  open class PolarGridHelper protected ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    /**
      * Creates a new {@link PolarGridHelper} of radius 'radius' with 'sectors' number of sectors and 'rings' number of rings, where each circle is smoothed into 'divisions' number of line segments.
      * @remarks Colors are optional.
      * @param radius The radius of the polar grid. This can be any positive number. Default `10`.
      * @param sectors The number of sectors the grid will be divided into. This can be any positive integer. Default `16`.
      * @param rings The number of rings. This can be any positive integer. Default `8`.
      * @param divisions The number of line segments used for each circle. This can be any positive integer that is 3 or greater. Default `64`.
      * @param color1 The first color used for grid elements. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x444444`.
      * @param color2 The second color used for grid elements. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x888888`.
      */
    def this(
      radius: js.UndefOr[Double],
      radials: js.UndefOr[Double],
      circles: js.UndefOr[Double],
      divisions: js.UndefOr[Double],
      color1: js.UndefOr[ColorRepresentation],
      color2: js.UndefOr[ColorRepresentation]
    ) = this()
    
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
      * @defaultValue `PolarGridHelper`
      */
    @JSName("type")
    val type_PolarGridHelper: String | typings.three.threeStrings.PolarGridHelper = js.native
  }
}
