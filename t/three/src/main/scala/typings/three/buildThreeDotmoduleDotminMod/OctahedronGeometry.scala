package typings.three.buildThreeDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "OctahedronGeometry")
@js.native
/**
  * Create a new instance of {@link OctahedronGeometry}
  * @param radius Radius of the octahedron. Expects a `Float`. Default `1`
  * @param detail Setting this to a value greater than zero add vertices making it no longer an octahedron. Expects a `Integer`. Default `0`
  */
open class OctahedronGeometry ()
  extends typings.three.srcThreeMod.OctahedronGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, detail: Double) = this()
  def this(radius: Unit, detail: Double) = this()
}
/* static members */
object OctahedronGeometry {
  
  @JSImport("three/build/three.module.min", "OctahedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesOctahedronGeometryMod.OctahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesOctahedronGeometryMod.OctahedronGeometry]
}
