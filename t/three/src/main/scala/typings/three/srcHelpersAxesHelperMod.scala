package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.Color
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersAxesHelperMod {
  
  @JSImport("three/src/helpers/AxesHelper", "AxesHelper")
  @js.native
  /**
    * Create a new instance of {@link AxesHelper}
    * @param size Size of the lines representing the axes. Default `1`
    */
  open class AxesHelper ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    def this(size: Double) = this()
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Sets the axes colors to {@link Color | xAxisColor}, {@link Color | yAxisColor}, {@link Color | zAxisColor}.
      * @param xAxisColor
      * @param yAxisColor
      * @param zAxisColor
      */
    def setColors(xAxisColor: Color, yAxisColor: Color, zAxisColor: Color): this.type = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `AxesHelper`
      */
    @JSName("type")
    val type_AxesHelper: String | typings.three.threeStrings.AxesHelper = js.native
  }
}
