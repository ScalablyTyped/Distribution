package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "SphericalHarmonics3")
@js.native
open class SphericalHarmonics3 ()
  extends typings.three.threeMod.SphericalHarmonics3
/* static members */
object SphericalHarmonics3 {
  
  @JSImport("three", "SphericalHarmonics3")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBasisAt(normal: typings.three.vector3Mod.Vector3, shBasis: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBasisAt")(normal.asInstanceOf[js.Any], shBasis.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
