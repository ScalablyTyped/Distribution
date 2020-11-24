package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/numeric/special_math/bessels", JSImport.Namespace)
@js.native
object besselsMod extends js.Object {
  
  @JSName("cyl_bessel_i")
  def cylBesselI(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_bessel_j")
  def cylBesselJ(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_bessel_k")
  def cylBesselK(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_neumann")
  def cylNeumann(v: Double, x: Double): Double = js.native
  
  @JSName("sph_bessel")
  def sphBessel(n: Double, x: Double): Double = js.native
  
  @JSName("sph_neumann")
  def sphNeumann(n: Double, x: Double): Double = js.native
}
