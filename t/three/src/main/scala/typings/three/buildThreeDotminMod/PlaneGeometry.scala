package typings.three.buildThreeDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "PlaneGeometry")
@js.native
/**
  * Create a new instance of {@link PlaneGeometry}
  * @param width Width along the X axis. Expects a `Float`. Default `1`
  * @param height Height along the Y axis. Expects a `Float`. Default `1`
  * @param widthSegments Number of segmented faces along the width of the sides. Expects a `Integer`. Default `1`
  * @param heightSegments Number of segmented faces along the height of the sides. Expects a `Integer`. Default `1`
  */
open class PlaneGeometry ()
  extends typings.three.srcThreeMod.PlaneGeometry {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Unit, height: Double) = this()
  def this(width: Double, height: Double, widthSegments: Double) = this()
  def this(width: Double, height: Unit, widthSegments: Double) = this()
  def this(width: Unit, height: Double, widthSegments: Double) = this()
  def this(width: Unit, height: Unit, widthSegments: Double) = this()
  def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
  def this(width: Double, height: Double, widthSegments: Unit, heightSegments: Double) = this()
  def this(width: Double, height: Unit, widthSegments: Double, heightSegments: Double) = this()
  def this(width: Double, height: Unit, widthSegments: Unit, heightSegments: Double) = this()
  def this(width: Unit, height: Double, widthSegments: Double, heightSegments: Double) = this()
  def this(width: Unit, height: Double, widthSegments: Unit, heightSegments: Double) = this()
  def this(width: Unit, height: Unit, widthSegments: Double, heightSegments: Double) = this()
  def this(width: Unit, height: Unit, widthSegments: Unit, heightSegments: Double) = this()
}
/* static members */
object PlaneGeometry {
  
  @JSImport("three/build/three.min", "PlaneGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesPlaneGeometryMod.PlaneGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesPlaneGeometryMod.PlaneGeometry]
}
