package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.OctahedronGeometry")
@js.native
/**
  * @param [radius=1]
  * @param [detail=0]
  */
open class OctahedronGeometry ()
  extends typings.three.mod.OctahedronGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, detail: Double) = this()
  def this(radius: Unit, detail: Double) = this()
}
/* static members */
object OctahedronGeometry {
  
  @JSGlobal("THREE.OctahedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.octahedronGeometryMod.OctahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.octahedronGeometryMod.OctahedronGeometry]
}
