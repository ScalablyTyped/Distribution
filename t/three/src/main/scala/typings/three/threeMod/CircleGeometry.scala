package typings.three.threeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "CircleGeometry")
@js.native
/**
  * @param [radius=1]
  * @param [segments=8]
  * @param [thetaStart=0]
  * @param [thetaLength=Math.PI * 2]
  */
open class CircleGeometry ()
  extends typings.three.geometriesMod.CircleGeometry {
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
  
  @JSImport("three/src/Three", "CircleGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.circleGeometryMod.CircleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.circleGeometryMod.CircleGeometry]
}
