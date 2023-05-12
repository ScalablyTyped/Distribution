package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.IcosahedronGeometry")
@js.native
/**
  * Create a new instance of {@link IcosahedronGeometry}
  * @param radius Expects a `Float`. Default `1`
  * @param detail Setting this to a value greater than 0 adds more vertices making it no longer an icosahedron.
  *               When detail is greater than 1, it's effectively a sphere. Expects a `Integer`. Default `0`
  */
open class IcosahedronGeometry ()
  extends typings.three.mod.IcosahedronGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, detail: Double) = this()
  def this(radius: Unit, detail: Double) = this()
}
/* static members */
object IcosahedronGeometry {
  
  @JSGlobal("THREE.IcosahedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry]
}
