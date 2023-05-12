package typings.three.buildThreeDotmoduleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "BoxGeometry")
@js.native
open class BoxGeometry protected ()
  extends typings.three.srcThreeMod.BoxGeometry {
  /**
    * Create a new instance of {@link BoxGeometry}
    * @param width Width; that is, the length of the edges parallel to the X axis. Optional; Expects a `Float`. Default `1`
    * @param height Height; that is, the length of the edges parallel to the Y axis. Optional; Expects a `Float`. Default `1`
    * @param depth Depth; that is, the length of the edges parallel to the Z axis. Optional; Expects a `Float`. Default `1`
    * @param widthSegments Number of segmented rectangular faces along the width of the sides. Optional; Expects a `Integer`. Default `1`
    * @param heightSegments Number of segmented rectangular faces along the height of the sides. Optional; Expects a `Integer`. Default `1`
    * @param depthSegments Number of segmented rectangular faces along the depth of the sides. Optional; Expects a `Integer`. Default `1`
    */
  def this(
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    depth: js.UndefOr[Double],
    widthSegments: js.UndefOr[Double],
    heightSegments: js.UndefOr[Double],
    depthSegments: js.UndefOr[Double]
  ) = this()
}
/* static members */
object BoxGeometry {
  
  @JSImport("three/build/three.module", "BoxGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesBoxGeometryMod.BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesBoxGeometryMod.BoxGeometry]
}
