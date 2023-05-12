package typings.three.buildThreeDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "CircleGeometry")
@js.native
/**
  * Create a new instance of {@link CircleGeometry}
  * @param radius Radius of the circle. Expects a `Float`. Default `1`
  * @param segments Number of segments (triangles). Expects a `Integer`. Minimum `3`. Default `32`
  * @param thetaStart Start angle for first segment. Expects a `Float`. Default `0`, _(three o'clock position)_.
  * @param thetaLength The central angle, often called theta, of the circular sector. Expects a `Float`. Default `Math.PI * 2`, _which makes for a complete circle_.
  */
open class CircleGeometry ()
  extends typings.three.srcThreeMod.CircleGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, segments: Double) = this()
  def this(radius: Unit, segments: Double) = this()
  def this(radius: Double, segments: Double, thetaStart: Double) = this()
  def this(radius: Double, segments: Unit, thetaStart: Double) = this()
  def this(radius: Unit, segments: Double, thetaStart: Double) = this()
  def this(radius: Unit, segments: Unit, thetaStart: Double) = this()
  def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
  def this(radius: Double, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
  def this(radius: Double, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
  def this(radius: Double, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
  def this(radius: Unit, segments: Double, thetaStart: Double, thetaLength: Double) = this()
  def this(radius: Unit, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
  def this(radius: Unit, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
  def this(radius: Unit, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
}
/* static members */
object CircleGeometry {
  
  @JSImport("three/build/three.min", "CircleGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesCircleGeometryMod.CircleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesCircleGeometryMod.CircleGeometry]
}
