package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "TetrahedronGeometry")
@js.native
/**
  * Create a new instance of {@link TetrahedronGeometry}
  * @param radius Radius of the tetrahedron. Expects a `Float`. Default `1`
  * @param detail Setting this to a value greater than 0 adds vertices making it no longer a tetrahedron. Expects a `Integer`. Default `0`
  */
open class TetrahedronGeometry ()
  extends typings.three.srcGeometriesGeometriesMod.TetrahedronGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, detail: Double) = this()
  def this(radius: Unit, detail: Double) = this()
}
/* static members */
object TetrahedronGeometry {
  
  @JSImport("three/src/Three", "TetrahedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesTetrahedronGeometryMod.TetrahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesTetrahedronGeometryMod.TetrahedronGeometry]
}
