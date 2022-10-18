package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.SphericalHarmonics3")
@js.native
open class SphericalHarmonics3 ()
  extends typings.three.mod.SphericalHarmonics3
/* static members */
object SphericalHarmonics3 {
  
  @JSGlobal("THREE.SphericalHarmonics3")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBasisAt(normal: typings.three.srcMathVector3Mod.Vector3, shBasis: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBasisAt")(normal.asInstanceOf[js.Any], shBasis.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
