package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.DodecahedronGeometry")
@js.native
/**
  * Create a new instance of {@link DodecahedronGeometry}
  * @param radius Radius of the dodecahedron. Expects a `Float`. Default `1`
  * @param detail Setting this to a value greater than 0 adds vertices making it no longer a dodecahedron. Expects a `Integer`. Default `0`
  */
open class DodecahedronGeometry ()
  extends typings.three.mod.DodecahedronGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, detail: Double) = this()
  def this(radius: Unit, detail: Double) = this()
}
/* static members */
object DodecahedronGeometry {
  
  @JSGlobal("THREE.DodecahedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesDodecahedronGeometryMod.DodecahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesDodecahedronGeometryMod.DodecahedronGeometry]
}
